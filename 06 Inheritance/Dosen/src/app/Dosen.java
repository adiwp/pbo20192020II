package app;

class Dosen extends Karyawan {
    private String NIDN;

    public Dosen(String kodeKaryawan, String NIDN, String nama) {
        super(kodeKaryawan, nama); // artinya constructor yang ada di child memanggil constructor parent!
        this.NIDN = NIDN;
    }

    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    public void getNIDN() {
        System.out.println("NIDN: " + this.NIDN);
    }

    public void ngajar() {
        System.out.println(this.nama + ": sedang mengajar");
    }

    // method overriding
    @Override // method getInfo() di child akan menimpa getInfo() parent
    public void getInfo() {
        super.getInfo();
        System.out.println("NIDN: " + this.NIDN);
    }
}