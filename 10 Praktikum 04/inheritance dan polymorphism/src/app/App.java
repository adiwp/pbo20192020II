package app;

public class App {
    public static void main(String[] args) throws Exception {
        // implementasi single inheritance
        Mobil m1 = new Mobil("Hino");
        Sedan vios = new Sedan("Vios");

        m1.klakson();
        vios.klakson();

        // implementasi multilevel inheritance
        Binatang kambing = new Binatang("kambing");
        Kucing mudreg = new Kucing("mudreg");
        Cemeng mocha = new Cemeng("mocha");

        kambing.bersuara();
        mudreg.bersuara();
        mocha.bersuara();

        // implementasi hierarchichal inheritance
        Karyawan wahyu = new Karyawan("Wahyu");
        Dosen amir = new Dosen("Amir Murtako");
        Staff melan = new Staff("Melan");

        wahyu.kerja();
        amir.kerja();
        melan.kerja();

        // implementasi method overloading
        MobilSport jaguar = new MobilSport("Jaguar");

        jaguar.gigi(1);
        jaguar.gigi(2);
        jaguar.gigi(3);
        jaguar.gigi(4);
        jaguar.gigi(5);
        jaguar.gigi(1, 1);
        jaguar.gigi(2, 1);
        jaguar.gigi(3, 1);
        jaguar.gigi(4, 1);
        jaguar.gigi(5, 1);
        jaguar.gigi(5, 2);
        jaguar.gigi(5, 3);
        jaguar.gigi(5, 4);
        jaguar.gigi(5, 5);
    }
}