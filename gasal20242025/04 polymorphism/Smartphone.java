public class Smartphone extends Handphone {

    public Smartphone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void nyalakan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang booting.");
    }

    @Override
    public void matikan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang shutdown.");
    }

    @Override
    public void telepon(String nomor) {
        System.out.println("Melakukan panggilan video ke nomor " + nomor);
    }

    public void aksesInternet() {
        System.out.println("Mengakses internet melalui Smartphone.");
    }
}
