package latihan;

public class Main {
    public static void main(String[] args) {
        Lampu l1 = new Lampu("Lampu1");
        Lampu l2 = new Lampu("Lampu2");

        l1.statusLampu();
        l2.statusLampu();

        l1.on();
        l1.statusLampu();
        l1.off();
        l1.statusLampu();

        l2.statusLampu();
        l2.on();
        l2.statusLampu();
        l2.off();
        l2.statusLampu();
    }
}