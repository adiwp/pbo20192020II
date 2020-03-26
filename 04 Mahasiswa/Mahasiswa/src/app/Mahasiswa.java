package app;

class Mahasiswa {
    String npm;
    String nama;

    Mahasiswa(String npm, String nama) {
        this.npm = npm;
        this.nama = nama;
    }

    void display() {
        System.out.println(this.npm);
        System.out.println(this.nama);
    }
}