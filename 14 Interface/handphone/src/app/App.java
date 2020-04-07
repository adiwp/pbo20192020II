package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // membuat objek HP
        Handphone redmiNote8 = new Xiaomi();

        // membuat objek user
        PenggunaHP dian = new PenggunaHP(redmiNote8);

        // kita coba nyalakan HP-nya
        dian.nyalakanHP();
        
        // biar enak, kita buat dalam program
        Scanner input = new Scanner(System.in);
        String aksi; 

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();
            
            if(aksi.equalsIgnoreCase("1")){
                dian.nyalakanHP();
            } else if (aksi.equalsIgnoreCase("2")){
                dian.matikanHP();
            } else if (aksi.equalsIgnoreCase("3")){
                dian.besarkanSuaraHP();
            } else if (aksi.equalsIgnoreCase("4")){
                dian.kecilkanSuaraHP();
            } else if (aksi.equalsIgnoreCase("0")){
                input.close();
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }
    }
}