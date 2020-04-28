package app;

public class Vivo implements Handphone {
    private int volume;
    private boolean menyala;

    public Vivo() {
        // set volume awal
        this.volume = 60;
    }

    @Override
    public void nyalakan() {
        menyala = true;
        System.out.println("Handphone menyala...");
        System.out.println("Selamat datang di Vivo");
        System.out.println("Android version 10");
    }

    @Override
    public void matikan() {
        menyala = false;
        System.out.println("Handphone dimatikan");
    }

    @Override
    public void besarkanSuara() {
        if (menyala) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume FULL!!");
                System.out.println("sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }

    @Override
    public void kecilkanSuara() {
        if (menyala) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume = 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }

    public int getVolume() {
        return this.volume;
    }
}