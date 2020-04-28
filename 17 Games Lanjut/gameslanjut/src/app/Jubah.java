package app;

class Jubah {
    private String nama;
    private int kekuatan;
    private int kesehatan;

    public Jubah(String nama, int kekuatan, int kesehatan) {
        this.nama = nama;
        this.kekuatan = kekuatan;
        this.kesehatan = kesehatan;
    }

    public String getNama() {
        return this.nama;
    }

    public int getTambahKesehatan() {
        return this.kesehatan * 10;
    }

    public int getNilaiKekuatan() {
        return this.kekuatan * 2;
    }
}