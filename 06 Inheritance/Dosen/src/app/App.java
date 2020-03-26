package app;

public class App {
    public static void main(String[] args) throws Exception {
        Karyawan Ridho = new Karyawan("123", "Ridho");

        Ridho.getInfo();
        Ridho.absenPagi();
        Ridho.kerja();
        Ridho.absenPulang();

        Dosen Amir = new Dosen("124", "32", "Amir");

        Amir.getInfo();
        Amir.absenPagi();
        Amir.kerja();
        Amir.ngajar();
        Amir.absenPulang();
    }
}