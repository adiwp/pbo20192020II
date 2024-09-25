public class Handphone {
    protected String merk;
    protected String model;

    public Handphone(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public void nyalakan() {
        System.out.println("Handphone dinyalakan.");
    }

    public void matikan() {
        System.out.println("Handphone dimatikan.");
    }

    public void telepon(String nomor) {
        System.out.println("Memanggil nomor " + nomor);
    }
}
