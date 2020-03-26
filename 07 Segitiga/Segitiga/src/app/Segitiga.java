package app;

class Segitiga {
    // deklarasi atribut segitiga
    private int alas;
    private int tinggi;

    // setter
    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    // getter
    public void getAlas() {
        System.out.println("Alas = " + this.alas);
    }

    public void getTinggi() {
        System.out.println("Tinggi = " + this.tinggi);
    }
}