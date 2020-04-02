package app;

class Mahasiswa {
    private String npm;
    private String nama;

    public Mahasiswa(String npm, String nama) {
        this.npm = npm;
        this.nama = nama;
    }

    public String getNPM() {
        return this.npm;
    }

    public String getNama() {
        return this.nama;
    }
}