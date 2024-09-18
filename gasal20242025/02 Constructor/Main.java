// Kelas Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Menggunakan constructor tanpa parameter
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.tampilkanInfo();

        System.out.println();

        // Menggunakan constructor dengan 2 parameter
        Mahasiswa mhs2 = new Mahasiswa("Budi", "12345678");
        mhs2.setUmur(20); // Mengatur umur menggunakan setter
        mhs2.tampilkanInfo();

        System.out.println();

        // Menggunakan constructor dengan 3 parameter
        Mahasiswa mhs3 = new Mahasiswa("Siti", "87654321", 22);
        mhs3.tampilkanInfo();
    }
}