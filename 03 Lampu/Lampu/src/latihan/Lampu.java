package latihan;

class Lampu {
    String namaLampu;
    boolean menyala;

    Lampu(String namaLampu) {
        this.namaLampu = namaLampu;
        this.menyala = false;
    }

    void on() {
        System.out.println(this.namaLampu + " dinyalakan");
        this.menyala = true;
    }

    void off() {
        System.out.println(this.namaLampu + " dimatikan");
        this.menyala = false;
    }

    void statusLampu() {
        System.out.print("Objek " + this.namaLampu + ". ");
        System.out.println("Lampu menyala? " + menyala);
    }
}