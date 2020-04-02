package app;

class Jurusan {
    private String kodeJurusan;
    private String namaJurusan;
    private Mahasiswa[] mahasiswa;
    private Dosen[] dosen;

    public Jurusan(String kodeJurusan, String namaJurusan) {
        this.kodeJurusan = kodeJurusan;
        this.namaJurusan = namaJurusan;
    }

    public void setMahasiswa(Mahasiswa[] mahasiswas) {
        this.mahasiswa = mahasiswas;
    }

    public void setDosen(Dosen[] dosen) {
        this.dosen = dosen;
    }

    public void displayInformasi() {
        System.out.println("Kode Jurusan" + this.kodeJurusan);
        System.out.println("JURUSAN: " + this.namaJurusan);

        System.out.println("Daftar Dosen");
        
        // hitung jumlah mahasiswa
        int m = this.dosen.length;
        int j = 0; // counter

        while (j < m) {
            System.out.println(dosen[j].getNIDN() + ": " + dosen[j].getNama());
            j++;
        }

        System.out.println("Daftar Mahasiswa");
        
        // hitung jumlah mahasiswa
        int n = this.mahasiswa.length;
        int i = 0; // counter

        while (i < n) {
            System.out.println(mahasiswa[i].getNPM() + ": " + mahasiswa[i].getNama());
            i++;
        }
    }
}