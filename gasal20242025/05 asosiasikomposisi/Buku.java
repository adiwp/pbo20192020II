import java.util.ArrayList;
import java.util.List;

public class Buku {
    private String judulBuku;
    private List<Bab> daftarBab;

    public Buku(String judulBuku) {
        this.judulBuku = judulBuku;
        this.daftarBab = new ArrayList<>();
        tambahBab();
    }

    private void tambahBab() {
        this.daftarBab.add(new Bab("Pendahuluan"));
        this.daftarBab.add(new Bab("Isi"));
        this.daftarBab.add(new Bab("Penutup"));
    }

    public void tampilkanBab() {
        System.out.println("Buku " + this.judulBuku + " memiliki bab:");
        for (Bab bab : daftarBab) {
            System.out.println("- " + bab.getJudulBab());
        }
    }
}