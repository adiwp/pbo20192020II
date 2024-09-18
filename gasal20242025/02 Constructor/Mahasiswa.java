// Kelas Mahasiswa dengan constructor overloading, setter, dan getter
public class Mahasiswa {
  
    // Variabel instance
    private String nama;
    private String nim;
    private int umur;

    // Constructor 1: tanpa parameter
    public Mahasiswa() {
        this.nama = "Belum Diisi";
        this.nim = "Belum Diisi";
        this.umur = 0;
    }

    // Constructor 2: dengan parameter nama dan nim
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        this.umur = 0; // Default umur
    }

    // Constructor 3: dengan parameter nama, nim, dan umur
    public Mahasiswa(String nama, String nim, int umur) {
        this.nama = nama;
        this.nim = nim;
        this.umur = umur;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk nim
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    // Getter dan Setter untuk umur
    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Method untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Umur: " + umur);
    }
}