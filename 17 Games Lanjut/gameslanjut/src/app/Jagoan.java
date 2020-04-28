package app;

class Jagoan {
    private String nama;
    private int kesehatanDasar;
    private int kekuatanDasar;
    private int derajat;
    private int totalKerusakan;
    private int kenaikanKesehatan;
    private int kenaikanKekuatan;
    private boolean hidup;
    
    // member berupa objek
    private Jubah jubah;        // relasi asosiasi, jagoan pakai jubah
    private Senjata senjata;    // relasi asosiasi, jagoan punya senjata
    
    public Jagoan(String nama) {
        this.nama = nama;
        this.kesehatanDasar = 100;
        this.kekuatanDasar = 100;
        this.derajat = 1;
        this.kenaikanKekuatan = 10;
        this.kenaikanKesehatan = 10;
        this.hidup = true;
    }
    
    public void setJubah(Jubah jubah) {
        this.jubah = jubah;
    }

    public void setSenjata(Senjata senjata) {
        this.senjata = senjata;
    }

    public String getNama() {
        return this.nama;
    }
    
    public int sehatMaksimal() {
        return this.kesehatanDasar + this.jubah.getTambahKesehatan() + this.derajat * this.kenaikanKesehatan;
    }
    
    public int getKekuatanSerangJagoan() {
        return this.kekuatanDasar + this.senjata.getKekuatanSerang() + this.derajat * this.kenaikanKekuatan;
    }

    public int getNilaiKesehatan() {
        return this.sehatMaksimal() - this.totalKerusakan;
    }
    
    private void naikDerajat() {
        this.derajat++;
    }

    public boolean getStatus() {
        return this.hidup;
    }

    // menyerang lawan
    public void menyerang(Jagoan lawan) {
        int kerusakan = this.getKekuatanSerangJagoan();

        System.out.println(this.nama + " menyerang " + lawan.getNama() + " dengan kekuatan " + kerusakan);

        lawan.bertahan(kerusakan);
        
        this.naikDerajat();
    }

    // bertahan dari lawan
    public void bertahan(int kerusakan) {
        int kekuatanBertahan = this.jubah.getNilaiKekuatan();
        int selisihKerusakan;

        System.out.println(this.nama + " memiliki kekuatan bertahan: " + kekuatanBertahan);

        if (kerusakan > kekuatanBertahan) {
            selisihKerusakan = kerusakan - kekuatanBertahan;
        } else {
            selisihKerusakan = 0;
        }

        System.out.println("Kerusakan yang diperoleh " + selisihKerusakan + "\n");

        // tambah total kerusakan
        this.totalKerusakan += selisihKerusakan;

        // periksa apakah jagoan masih hidup?
        if (this.getNilaiKesehatan() <= 0) {
            this.hidup = false;
            this.totalKerusakan = this.sehatMaksimal();
        }

        this.info();
    }

    public void info() {
        System.out.println("Jagoan\t\t\t: " + this.nama);
        System.out.println("Derajat\t\t\t: " + this.derajat);
        System.out.println("Kesehatan Dasar\t\t: " + this.kesehatanDasar);
        System.out.println("Kekuatan Dasar\t\t: " + this.kekuatanDasar);
        System.out.println("Kesehatan\t\t: " + this.getNilaiKesehatan() + "/" + this.sehatMaksimal());
        System.out.println("Kekuatan Maksimal\t: " + this.getKekuatanSerangJagoan());
        System.out.println("Masih hidup?\t\t: " + this.hidup + "\n");
    }

    public void getNamaJubah(){
        System.out.println("Jubah\t\t\t: " + this.jubah.getNama());
    }
    public void getNamaSenjata() {
        System.out.println("Senjata\t\t\t: " + this.senjata.getNama());
    }
}