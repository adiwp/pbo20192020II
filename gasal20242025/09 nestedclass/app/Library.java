package app;

public class Library {
    static String libraryName;

    public static String getLibraryName() {
        return libraryName;
    }

    static class Book {
        private String title;
        private String author;
        private String isbn;

        public Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }

        public void displayBookInfo() {
            System.out.println("Nama Perpustakaan: " + Library.getLibraryName());
            System.out.println("Judul Buku: " + title);
            System.out.println("Penulis: " + author);
            System.out.println("ISBN: " + isbn);
            System.out.println("-----------------------------");
        }
    }
}