public class Main {
    public static void main(String[] args) {
        // membuat object iPhone dari class iPhone
        iPhone iphone13 = new iPhone("Red", "128GB"); // proses inisiasi atau instantiation
        iPhone iphone14 = new iPhone("Grey", "256GB");// proses inisiasi atau instantiation

        System.out.println("Spesifikasi iPhone 13");
        System.out.println("Warna: " + iphone13.getColor());
        System.out.println("Storage: " + iphone13.getStorage());

        System.out.println("Spesifikasi iPhone 14");
        System.out.println("Warna: " + iphone14.getColor());
        System.out.println("Storage: " + iphone14.getStorage());
    }
}
