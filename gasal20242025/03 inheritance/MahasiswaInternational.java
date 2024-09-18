// Kelas MahasiswaInternational (Subclass) yang mewarisi Mahasiswa
public class MahasiswaInternational extends Mahasiswa {
    // Variabel tambahan untuk mahasiswa internasional
    private String negaraAsal;

    // Constructor 1: tanpa parameter, memanggil constructor parent
    public MahasiswaInternational() {
        super(); // Memanggil constructor parent tanpa parameter
        this.negaraAsal = "Belum Diisi";
    }

    // Constructor 2: dengan parameter nama, nim, dan negara asal
    public MahasiswaInternational(String nama, String nim, String negaraAsal) {
        super(nama, nim); // Memanggil constructor parent dengan dua parameter
        this.negaraAsal = negaraAsal;
    }

    // Constructor 3: dengan parameter nama, nim, umur, dan negara asal
    public MahasiswaInternational(String nama, String nim, int umur, String negaraAsal) {
        super(nama, nim, umur); // Memanggil constructor parent dengan tiga parameter
        this.negaraAsal = negaraAsal;
    }

    // Getter dan Setter untuk negara asal
    public String getNegaraAsal() {
        return negaraAsal;
    }

    public void setNegaraAsal(String negaraAsal) {
        this.negaraAsal = negaraAsal;
    }

    // Override method tampilkanInfo untuk menampilkan informasi tambahan
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil method tampilkanInfo dari parent
        System.out.println("Negara Asal: " + negaraAsal);
    }
}