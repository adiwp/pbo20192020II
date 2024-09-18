// Kelas Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Menggunakan constructor tanpa parameter di MahasiswaInternational
        MahasiswaInternational mhsInt1 = new MahasiswaInternational();
        mhsInt1.setNama("Paolo Dicanio");
        mhsInt1.setNim("INT12345");
        mhsInt1.setUmur(21);
        mhsInt1.setNegaraAsal("Italy");
        mhsInt1.tampilkanInfo();

        System.out.println();

        // Menggunakan constructor dengan 3 parameter (nama, nim, negara)
        MahasiswaInternational mhsInt2 = new MahasiswaInternational("Sarah", "INT67890", "Australia");
        mhsInt2.setUmur(22); // Mengatur umur menggunakan setter
        mhsInt2.tampilkanInfo();

        System.out.println();

        // Menggunakan constructor dengan 4 parameter (nama, nim, umur, negara)
        MahasiswaInternational mhsInt3 = new MahasiswaInternational("David", "INT54321", 23, "UK");
        mhsInt3.tampilkanInfo();
    }
}