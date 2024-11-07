package com;

public class Main {
    public static void main(String[] args) {
        // Membuat objek ATM
        ATM atm = new ATM("Jakarta");

        // Membuat objek BankAccount melalui objek ATM
        ATM.BankAccount account = atm.new BankAccount("0011223344");

        // Menampilkan saldo awal
        account.displayAccountInfo();

        // Melakukan deposit
        account.deposit(1000000);
        account.displayAccountInfo();

        // Melakukan withdraw
        account.withdraw(500000);
        account.displayAccountInfo();
    }
}