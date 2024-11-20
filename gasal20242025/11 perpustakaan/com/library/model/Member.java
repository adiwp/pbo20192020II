package com.library.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Member extends Person {
    private List<Book> borrowedBooks;
    private double fine;

    public Member(String name, String id) {
        super(name, id);
        borrowedBooks = new ArrayList<>();
        fine = 0.0;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        book.setBorrowed(true);
        book.setBorrowDate(LocalDate.now());
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.setBorrowed(false);
        // Cek keterlambatan
        if (LocalDate.now().isAfter(book.getDueDate())) {
            long daysLate = java.time.temporal.ChronoUnit.DAYS.between(book.getDueDate(), LocalDate.now());
            double lateFine = daysLate * 5000; // Misal denda Rp5.000 per hari
            addFine(lateFine);
            System.out.println("Anda terlambat " + daysLate + " hari. Denda: Rp" + lateFine);
        }
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public double getFine() {
        return fine;
    }

    public void addFine(double amount) {
        fine += amount;
    }

    public void payFine(double amount) {
        if (amount <= fine) {
            fine -= amount;
            System.out.println("Denda sebesar Rp" + amount + " telah dibayar.");
        } else {
            System.out.println("Jumlah pembayaran melebihi denda yang ada.");
        }
    }
}