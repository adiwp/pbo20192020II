package app;

public class App {
    public static void main(String[] args) throws Exception {
        Mobil avanza = new Mobil("Avanza", new Mesin(TipeMesin.BENSIN));
        Mobil pajero = new Mobil("Pajero", new Mesin(TipeMesin.DIESEL));

        avanza.displayInformasi();
        pajero.displayInformasi();
    }
}