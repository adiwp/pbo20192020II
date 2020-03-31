package app;

class Dosen extends Karyawan {
    public Dosen(String nama) {
        super(nama);
    }

    public void kerja() {
        System.out.println("Ngajar");
    }
}