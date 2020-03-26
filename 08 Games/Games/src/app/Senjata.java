package app;

class Senjata {
    private String nama;
    private int kekuatan;

    public Senjata(String nama, int kekuatan) {
        this.nama = nama;
        this.kekuatan = kekuatan;
    }

    public String getNama() {
        return this.nama;
    }

    public int getKekuatanSerang() {
        return this.kekuatan * 2;
    }
}