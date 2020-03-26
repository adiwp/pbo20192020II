package app;

class Jubah {
    private String nama;
    private int kesehatan;

    public Jubah(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    public String getNama() {
        return this.nama;
    }

    public int getTambahKesehatan() {
        return this.kesehatan * 10;
    }
}