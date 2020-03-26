package app;

public class App {
    public static void main(String[] args) {
        Jagoan pitung = new Jagoan("Pitung");
        Jubah bajuKoko = new Jubah("Baju Koko", 5);
        Senjata golok = new Senjata("Golok", 50);

        pitung.setJubah(bajuKoko);
        pitung.setSenjata(golok);

        pitung.info();

        Jagoan jakaSembung = new Jagoan("Jaka Sembung");
        Jubah bajuUlar = new Jubah("Baju Ular", 100);
        Senjata kapak = new Senjata("Kapak", 75);

        jakaSembung.setJubah(bajuUlar);
        jakaSembung.setSenjata(kapak);

        jakaSembung.info();

        Jagoan wiroSableng = new Jagoan("Wiro Sableng");
        Jubah kenconoGeni = new Jubah("Kencono Geni", 200);
        Senjata nagaGeni = new Senjata("Kapak Naga Geni", 100);

        wiroSableng.setJubah(kenconoGeni);
        wiroSableng.setSenjata(nagaGeni);

        wiroSableng.info();
    }
}