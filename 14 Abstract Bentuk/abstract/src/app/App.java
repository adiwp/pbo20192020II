package app;

abstract class BangunDatar {
    public String warna;
    abstract void luas();
}

class Segitiga extends BangunDatar {
    private int alas;
    private int tinggi;
    public Segitiga(int alas, int tinggi, String warna) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.warna = warna;        
    }
    public void luas() {
        float l = (float) (this.alas * this.tinggi) / 2;
        System.out.println("Luas Segitiga: " + l);
    }
}

class Lingkaran extends BangunDatar {
    private int jari2;
    
    public Lingkaran(int jari2, String warna) {
        this.jari2 = jari2;
        this.warna = warna;
    }

    public void luas() {
        float l = (float) (this.jari2 * this.jari2 * (22.0/7.0));
        System.out.println("Luas Lingkaran: " + l);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Segitiga s1 = new Segitiga(10, 6, "Merah");
        Lingkaran l1 = new Lingkaran(10, "Biru");

        s1.luas();
        l1.luas();
    }
}