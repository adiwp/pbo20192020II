import java.util.List;

public class Tim {
    private String namaTim;
    private List<Pemain> daftarPemain;

    public Tim(String namaTim, List<Pemain> daftarPemain) {
        this.namaTim = namaTim;
        this.daftarPemain = daftarPemain;
    }

    public void tampilkanPemain() {
        System.out.println("Tim " + this.namaTim + " memiliki pemain:");
        for (Pemain pemain : daftarPemain) {
            System.out.println("- " + pemain.getNama());
        }
    }
}