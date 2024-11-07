package com;

public class ATM {
    private String location;

    public ATM(String location) {
        this.location = location;
    }

    class BankAccount {
        private String accountNumber;
        private double balance;

        public BankAccount(String accountNumber) {
            this.accountNumber = accountNumber;
            this.balance = 0.0;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposit: Rp" + String.format("%,.2f", amount));
            } else {
                System.out.println("Jumlah deposit harus positif.");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdraw: Rp" + String.format("%,.2f", amount));
            } else {
                System.out.println("Penarikan tidak valid.");
            }
        }

        public void displayAccountInfo() {
            System.out.println("Lokasi ATM: " + ATM.this.location);
            System.out.println("Nomor Akun: " + accountNumber);
            System.out.println("Saldo Sekarang: Rp" + String.format("%,.2f", balance));
            System.out.println("-----------------------------");
        }
    }
}