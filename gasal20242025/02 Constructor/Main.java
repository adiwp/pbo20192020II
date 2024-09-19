// Kelas Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // // Menggunakan constructor tanpa parameter
        // Mahasiswa mhs1 = new Mahasiswa();
        // mhs1.tampilkanInfo();

        // System.out.println();

        // // Menggunakan constructor dengan 2 parameter
        // Mahasiswa mhs2 = new Mahasiswa("Budi", "12345678");
        // mhs2.setUmur(20); // Mengatur umur menggunakan setter
        // mhs2.tampilkanInfo();

        // System.out.println();

        // // Menggunakan constructor dengan 3 parameter
        // Mahasiswa mhs3 = new Mahasiswa("Siti", "87654321", 22);
        // mhs3.tampilkanInfo();

        Mahasiswa soja = new Mahasiswa();
        soja.tampilkanInfo();

        // memberikan value Soja Purnamasari ke property nama dari objek soja
        soja.setNama("Soja Purnamasari");
        System.out.println("Nama : " + soja.getNama());

        soja.setNim("4523210104");
        System.out.println("NIM : " + soja.getNim());

        soja.setUmur(15);
        System.out.println("Umur : " + soja.getUmur());

        // Constructor lengkap
        Mahasiswa nenden = new Mahasiswa("Nenden Nuraini", "4523210144", 17);
        nenden.tampilkanInfo();
    }
}