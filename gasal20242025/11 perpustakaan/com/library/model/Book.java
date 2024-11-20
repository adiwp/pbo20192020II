package com.library.model;

import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;
    private LocalDate borrowDate;
    private LocalDate dueDate;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    // Getter dan Setter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


    public String getIsbn() {
        return isbn;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
        this.dueDate = borrowDate.plusDays(14); // Misal batas peminjaman 14 hari
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
}