import app.model.Mahasiswa;
import app.util.Matematika;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Andi");
        System.out.println("Nama Mahasiswa: " + mhs.getNama());

        Matematika m = new Matematika();
        int hasilTambah = m.tambah(5, 7);
        int hasilKali = m.kali(5, 7);

        System.out.println("Hasil Tambah: " + hasilTambah);
        System.out.println("Hasil Kali: " + hasilKali);
    }
}