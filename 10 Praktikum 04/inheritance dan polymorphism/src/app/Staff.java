package app;

class Staff extends Karyawan {
    public Staff(String nama) {
        super(nama);
    }

    public void kerja() {
        System.out.println("membantu dosen");
    }
}