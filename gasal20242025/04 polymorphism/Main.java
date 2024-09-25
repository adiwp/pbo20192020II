public class Main {
    public static void main(String[] args) {
        // Membuat array atau list dari Handphone
        Handphone[] daftarHandphone = new Handphone[2];

        // Mengisi array dengan objek Smartphone dan FeaturePhone
        daftarHandphone[0] = new Smartphone("Samsung", "Galaxy S21");
        daftarHandphone[1] = new FeaturePhone("Nokia", "3310");

        // Menggunakan loop untuk memanggil metode secara polimorfik
        for (Handphone hp : daftarHandphone) {
            hp.nyalakan();
            hp.telepon("08123456789");
            hp.matikan();
            System.out.println();
        }

        // Mengakses metode khusus dengan casting
        for (Handphone hp : daftarHandphone) {
            if (hp instanceof Smartphone) {
                ((Smartphone) hp).aksesInternet();
            } else if (hp instanceof FeaturePhone) {
                ((FeaturePhone) hp).mainGameSnake();
            }
        }
    }
}
