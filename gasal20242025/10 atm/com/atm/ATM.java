package com.atm;

import com.atm.model.Account;
import com.atm.transaction.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ATM {
    private Map<String, Account> accounts;

    public ATM() {
        accounts = new HashMap<>();
        initializeAccounts();
    }

    private void initializeAccounts() {
        // Menambahkan akun contoh
        accounts.put("123456", new Account("123456", "1234", 500000));
        accounts.put("654321", new Account("654321", "4321", 1000000));
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nomor akun: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Masukkan PIN: ");
        String pin = scanner.nextLine();

        Account account = authenticateUser(accountNumber, pin);

        if (account != null) {
            showMenu(account);
        } else {
            System.out.println("Autentikasi gagal.");
        }
    }

    private Account authenticateUser(String accountNumber, String pin) {
        Account account = accounts.get(accountNumber);
        if (account != null && account.getPin().equals(pin)) {
            return account;
        }
        return null;
    }

    private void showMenu(Account account) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Penarikan");
            System.out.println("2. Deposit");
            System.out.println("3. Transfer");
            System.out.println("4. Cek Saldo");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Transaction withdrawal = new Withdrawal(account);
                    withdrawal.execute();
                    break;
                case 2:
                    Transaction deposit = new Deposit(account);
                    deposit.execute();
                    break;
                case 3:
                    scanner.nextLine(); // Membersihkan buffer
                    System.out.print("Masukkan nomor akun tujuan: ");
                    String targetAccountNumber = scanner.nextLine();
                    Account targetAccount = accounts.get(targetAccountNumber);

                    if (targetAccount != null) {
                        Transaction transfer = new Transfer(account, targetAccount);
                        transfer.execute();
                    } else {
                        System.out.println("Akun tujuan tidak ditemukan.");
                    }
                    break;
                case 4:
                    System.out.println("Saldo Anda: " + account.getBalance());
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan ATM kami.");
                    break;
                default:
                    System.out.println("Opsi tidak valid.");
            }

        } while (choice != 5);
    }
}