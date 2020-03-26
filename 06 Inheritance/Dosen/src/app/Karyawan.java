package app;

class Karyawan {
    protected String kodeKaryawan;
    protected String nama;

    public Karyawan(String kodeKaryawan, String nama) {
        this.kodeKaryawan = kodeKaryawan;
        this.nama = nama;
    }

    public void absenPagi() {
        System.out.println(this.nama + ": absen pagi");
    }

    public void kerja() {
        System.out.println(this.nama + ": sedang bekerja");
    }

    public void absenPulang() {
        System.out.println(this.nama + ": absen pulang");
    }

    public void getInfo() {
        System.out.println("Kode Karyawan: " + this.kodeKaryawan);
        System.out.println("Nama: " + this.nama);
    }
}