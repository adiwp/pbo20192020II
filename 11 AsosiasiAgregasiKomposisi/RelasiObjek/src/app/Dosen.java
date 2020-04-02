package app;

class Dosen {
    private String nidn;
    private String nama;
    private String[] npmMahasiswa;

    public Dosen(String nidn, String nama) {
        this.nidn = nidn;
        this.nama = nama;
    }

    public void setNpmMahasiswa (String[] npmMahasiswa) {
        this.npmMahasiswa = npmMahasiswa;
    }

    // menampilkan npm-npm mahasiswa-nya Dosen
    public void getNpmMahasiswa() {
        // mendapatkan panjang Array
        int n = this.npmMahasiswa.length;
        int i = 0;  // counter
        while (i < n) {
            System.out.println("Peserta ke-" + (i+1) +": " + this.npmMahasiswa[i]);
            i++;
        }
    }

    public String getNama() {
        return this.nama;
    }

    public String getNIDN() {
        return this.nidn;
    }
}