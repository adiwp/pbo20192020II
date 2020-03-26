package app;

class SegiEmpat {
    public int luas(int panjang, int lebar) {
        return panjang * lebar;
    }
    
    public int luas(int sisi) {
        return sisi * 4;
    }

    public int keliling(int panjang, int lebar) {
        return (panjang + lebar) * 2;
    }
    
    public int keliling(int sisi) {
        return sisi * 4;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        SegiEmpat s1 = new SegiEmpat();
        SegiEmpat bs = new SegiEmpat();

        System.out.println("Luas Segi Empat: " + s1.luas(10, 4));
        System.out.println("Luas Bujursangkar: " + bs.luas(8));
        System.out.println("Keliling Segi Empat: " + s1.keliling(10, 4));
        System.out.println("Keliling Bujur Sangkar: " + bs.keliling(8));
    }
}