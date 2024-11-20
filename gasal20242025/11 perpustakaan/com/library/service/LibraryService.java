package com.library.service;

import com.library.model.Book;
import com.library.model.Member;
import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private List<Book> books;
    private List<Member> members;

    public LibraryService() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    // Metode untuk menambahkan buku
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Buku '" + book.getTitle() + "' telah ditambahkan.");
    }

    // Metode untuk menghapus buku
    public void removeBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            books.remove(book);
            System.out.println("Buku '" + book.getTitle() + "' telah dihapus.");
        } else {
            System.out.println("Buku dengan ISBN " + isbn + " tidak ditemukan.");
        }
    }

    // Metode untuk mendaftarkan anggota
    public void registerMember(Member member) {
        members.add(member);
        System.out.println("Anggota '" + member.getName() + "' telah didaftarkan.");
    }

    // Metode untuk meminjam buku
    public void borrowBook(String memberId, String isbn) {
        Member member = findMember(memberId);
        Book book = findBook(isbn);

        if (member != null && book != null && !book.isBorrowed()) {
            member.borrowBook(book);
            System.out.println("Buku '" + book.getTitle() + "' telah dipinjam oleh '" + member.getName() + "'.");
        } else {
            System.out.println("Peminjaman gagal. Buku mungkin sudah dipinjam atau data tidak ditemukan.");
        }
    }

    // Metode untuk mengembalikan buku
    public void returnBook(String memberId, String isbn) {
        Member member = findMember(memberId);
        Book book = findBook(isbn);

        if (member != null && book != null && book.isBorrowed()) {
            member.returnBook(book);
            System.out.println("Buku '" + book.getTitle() + "' telah dikembalikan oleh '" + member.getName() + "'.");
            if (member.getFine() > 0) {
                System.out.println("Total denda Anda: Rp" + member.getFine());
            }
        } else {
            System.out.println("Pengembalian gagal. Buku mungkin belum dipinjam atau data tidak ditemukan.");
        }
    }

    // Metode untuk mencari anggota
    public Member findMember(String memberId) {
        for (Member member : members) {
            if (member.getId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    // Metode untuk mencari buku
    public Book findBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    // Metode untuk menampilkan buku yang tersedia
    public void listAvailableBooks() {
        System.out.println("Daftar Buku yang Tersedia:");
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println("- " + book.getTitle() + " oleh " + book.getAuthor() + " (ISBN: " + book.getIsbn() + ")");
            }
        }
    }

    // Metode untuk menampilkan buku yang dipinjam
    public void listBorrowedBooks() {
        System.out.println("Daftar Buku yang Dipinjam:");
        for (Book book : books) {
            if (book.isBorrowed()) {
                System.out.println("- " + book.getTitle() + " oleh " + book.getAuthor() + " (ISBN: " + book.getIsbn() + ")");
            }
        }
    }

    // Metode untuk menampilkan daftar anggota dan buku yang dipinjam
    public void listMembers() {
        if (members.isEmpty()) {
            System.out.println("Belum ada anggota yang terdaftar.");
        } else {
            System.out.println("Daftar Anggota:");
            for (Member member : members) {
                System.out.println("- Nama: " + member.getName() + ", ID: " + member.getId());
                List<Book> borrowedBooks = member.getBorrowedBooks();
                if (borrowedBooks.isEmpty()) {
                    System.out.println("  Tidak ada buku yang dipinjam.");
                } else {
                    System.out.println("  Buku yang dipinjam:");
                    for (Book book : borrowedBooks) {
                        System.out.println("    * " + book.getTitle() + " (ISBN: " + book.getIsbn() + ")");
                    }
                }
            }
        }
    }
}