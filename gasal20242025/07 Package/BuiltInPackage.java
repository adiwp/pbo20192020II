import java.util.ArrayList;

public class BuiltInPackage {
    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<>();
        daftarNama.add("Ali");
        daftarNama.add("Budi");
        daftarNama.add("Cici");

        for (String nama : daftarNama) {
            System.out.println(nama);
        }
    }
}