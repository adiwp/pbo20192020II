package app;

public class App {
    public static void main(String[] args) throws Exception {
        Jagoan pitung = new Jagoan("Pitung");
        Jubah jubahSilatPutih = new Jubah("Jubah Silat Putih", 7, 50);
        Senjata golok = new Senjata("Golok", 20);

        pitung.setJubah(jubahSilatPutih);
        pitung.setSenjata(golok);

        Jagoan jakaSembung = new Jagoan("Jaka Sembung");
        Jubah jubahSilatHitam = new Jubah("Jubah Silat Hitam", 10, 50);
        Senjata toya = new Senjata("Toya", 25);

        jakaSembung.setJubah(jubahSilatHitam);
        jakaSembung.setSenjata(toya);

        pitung.info();
        jakaSembung.info();

        jakaSembung.menyerang(pitung);
        jakaSembung.menyerang(pitung);
        jakaSembung.menyerang(pitung);
        jakaSembung.menyerang(pitung);
        
        pitung.menyerang(jakaSembung);
        pitung.menyerang(jakaSembung);
        pitung.menyerang(jakaSembung);
        pitung.menyerang(jakaSembung);

        System.out.println(pitung.getNama() + ": " + pitung.getNilaiKesehatan());
        System.out.println(jakaSembung.getNama() + ": " + jakaSembung.getNilaiKesehatan());

        if (pitung.getStatus() && jakaSembung.getStatus() == false) {
            System.out.println(pitung.getNama() + " menang cuy!");
        } else if (pitung.getStatus() == false && jakaSembung.getStatus()) {
            System.out.println(jakaSembung.getNama() + " menang cuy!");
        } else {
            if (pitung.getNilaiKesehatan() > jakaSembung.getNilaiKesehatan()) {
                System.out.println(pitung.getNama() + " menang cuy!");
            } else if (pitung.getNilaiKesehatan() < jakaSembung.getNilaiKesehatan()) {
                System.out.println(jakaSembung.getNama() + " menang cuy!");
            } else {
                System.out.println("Kedua jagoan seri, cuy!");
            }
        }
    }
};