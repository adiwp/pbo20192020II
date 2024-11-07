package app;

public class Main {
    public static void main(String[] args) {
        // Mengatur nama perpustakaan
        Library.libraryName = "Perpustakaan Kota";

        // Membuat objek buku
        Library.Book book1 = new Library.Book("Pemrograman Java", "Budi", "1234567890");
        Library.Book book2 = new Library.Book("Algoritma dan Struktur Data", "Siti", "0987654321");

        // Menampilkan informasi buku
        book1.displayBookInfo();
        book2.displayBookInfo();
    }
}