package com.library;

import com.library.model.Book;
import com.library.model.Member;
import com.library.service.LibraryService;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();
        Scanner scanner = new Scanner(System.in);
        int mainChoice = 0;

        // Tambahkan beberapa buku dan anggota contoh
        libraryService.addBook(new Book("Pemrograman Java", "Andi", "ISBN001"));
        libraryService.addBook(new Book("Struktur Data", "Budi", "ISBN002"));
        libraryService.addBook(new Book("Basis Data", "Cici", "ISBN003"));

        libraryService.registerMember(new Member("Dewi", "MEM001"));
        libraryService.registerMember(new Member("Eka", "MEM002"));

        do {
            System.out.println("\nSelamat datang di Sistem Manajemen Perpustakaan");
            System.out.println("Pilih jenis pengguna:");
            System.out.println("1. Member");
            System.out.println("2. Petugas Perpustakaan");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            mainChoice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            if (mainChoice == 1) {
                // Menu untuk Member
                int choice;
                do {
                    System.out.println("\n=== Menu Member ===");
                    System.out.println("1. Daftar Buku yang Tersedia");
                    System.out.println("2. Pinjam Buku");
                    System.out.println("3. Kembalikan Buku");
                    System.out.println("4. Cek Denda");
                    System.out.println("5. Bayar Denda");
                    System.out.println("6. Keluar ke Menu Utama");
                    System.out.print("Pilih opsi: ");
                    choice = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan buffer

                    switch (choice) {
                        case 1:
                            libraryService.listAvailableBooks();
                            break;
                        case 2:
                            System.out.print("Masukkan ID anggota: ");
                            String borrowerId = scanner.nextLine();
                            System.out.print("Masukkan ISBN buku: ");
                            String borrowIsbn = scanner.nextLine();
                            libraryService.borrowBook(borrowerId, borrowIsbn);
                            break;
                        case 3:
                            System.out.print("Masukkan ID anggota: ");
                            String returnerId = scanner.nextLine();
                            System.out.print("Masukkan ISBN buku: ");
                            String returnIsbn = scanner.nextLine();
                            libraryService.returnBook(returnerId, returnIsbn);
                            break;
                        case 4:
                            System.out.print("Masukkan ID anggota: ");
                            String fineMemberId = scanner.nextLine();
                            Member fineMember = libraryService.findMember(fineMemberId);
                            if (fineMember != null) {
                                System.out.println("Total denda: Rp" + fineMember.getFine());
                            } else {
                                System.out.println("Anggota tidak ditemukan.");
                            }
                            break;
                        case 5:
                            System.out.print("Masukkan ID anggota: ");
                            String payMemberId = scanner.nextLine();
                            Member payMember = libraryService.findMember(payMemberId);
                            if (payMember != null) {
                                System.out.print("Masukkan jumlah pembayaran: Rp");
                                double amount = scanner.nextDouble();
                                scanner.nextLine(); // Membersihkan buffer
                                payMember.payFine(amount);
                            } else {
                                System.out.println("Anggota tidak ditemukan.");
                            }
                            break;
                        case 6:
                            System.out.println("Kembali ke menu utama...");
                            break;
                        default:
                            System.out.println("Opsi tidak valid.");
                    }
                } while (choice != 6);
            } else if (mainChoice == 2) {
                // Menu untuk Petugas Perpustakaan
                int choice;
                do {
                    System.out.println("\n=== Menu Petugas Perpustakaan ===");
                    System.out.println("1. Tambah Buku");
                    System.out.println("2. Hapus Buku");
                    System.out.println("3. Daftarkan Anggota");
                    System.out.println("4. Daftar Buku yang Tersedia");
                    System.out.println("5. Daftar Buku yang Dipinjam");
                    System.out.println("6. Daftar Anggota");
                    System.out.println("7. Keluar ke Menu Utama");
                    System.out.print("Pilih opsi: ");
                    choice = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan buffer

                    switch (choice) {
                        case 1:
                            System.out.print("Masukkan judul buku: ");
                            String title = scanner.nextLine();
                            System.out.print("Masukkan penulis: ");
                            String author = scanner.nextLine();
                            System.out.print("Masukkan ISBN: ");
                            String isbn = scanner.nextLine();
                            libraryService.addBook(new Book(title, author, isbn));
                            break;
                        case 2:
                            System.out.print("Masukkan ISBN buku yang akan dihapus: ");
                            String removeIsbn = scanner.nextLine();
                            libraryService.removeBook(removeIsbn);
                            break;
                        case 3:
                            System.out.print("Masukkan nama anggota: ");
                            String memberName = scanner.nextLine();
                            System.out.print("Masukkan ID anggota: ");
                            String memberId = scanner.nextLine();
                            libraryService.registerMember(new Member(memberName, memberId));
                            break;
                        case 4:
                            libraryService.listAvailableBooks();
                            break;
                        case 5:
                            libraryService.listBorrowedBooks();
                            break;
                        case 6:
                            libraryService.listMembers();
                            break;
                        case 7:
                            System.out.println("Kembali ke menu utama...");
                            break;
                        default:
                            System.out.println("Opsi tidak valid.");
                    }
                } while (choice != 7);
            } else if (mainChoice == 3) {
                System.out.println("Terima kasih telah menggunakan sistem ini.");
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (mainChoice != 3);
    }
}