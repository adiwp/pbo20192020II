package app;

class Mobil {
    private String nama;
    private final Mesin mesin;

    public Mobil(String nama, Mesin mesin) {
        this.nama = nama;
        this.mesin = mesin;
    }

    public void displayInformasi() {
        System.out.println("Mobil " + this.nama);
        System.out.println("Mesinnya " + this.mesin.getTipeMesin().toString());
    }
}