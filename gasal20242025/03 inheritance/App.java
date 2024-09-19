public class App {
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();

        bd.luas();
        bd.keliling();

        // instantiate / membuat objek lingkaran
        Lingkaran lk = new Lingkaran(15);
        System.out.println("Luas lingkaran: " + lk.luas());
        System.out.println("keliling lingkaran: " + lk.keliling());

        // instantiate / membuat objek Persegi
        Persegi pj = new Persegi(10);
        System.out.println("Luas Bujur Sangkar: " + pj.luas());
        System.out.println("keliling Bujur Sangkar: " + pj.keliling());

        // instantiate / membuat objek segitiga
        Segitiga sg = new Segitiga(10, 8);
        System.out.println("Luas Segitiga: " + sg.luas());
        // karena class Segitiga tidak mendefinisikan keliling
        // maka ketika sg memanggil keliling(), yang terpanggil
        // adalah keliling() yang ada di parent/super class yaitu
        // BangunDatar
        sg.keliling();
        // System.out.println("keliling Segitiga: " + sg.keliling());
    }
}