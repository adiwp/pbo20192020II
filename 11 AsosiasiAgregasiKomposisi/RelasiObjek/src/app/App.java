package app;

public class App {
    public static void main(String[] args) throws Exception {
        Dosen amir = new Dosen("12345", "Amir Murtako");
        Dosen bambang = new Dosen("12346", "Bambang Riono");
        Dosen agung = new Dosen("12347", "Agung Saputra");
        Dosen desti = new Dosen("12348", "Desti Fitriati");
        Dosen aterminanto = new Dosen("12349", "Agung Terminanto");

        Mahasiswa rina = new Mahasiswa("123", "Rina");
        Mahasiswa rano = new Mahasiswa("124", "Rano");
        Mahasiswa doel = new Mahasiswa("125", "Doel");
        Mahasiswa jajang = new Mahasiswa("126", "Jajang");

        String[] PAPakAmir = {doel.getNPM(), jajang.getNPM()};
        String[] PAMasBambang = {rina.getNPM(), rano.getNPM()};

        amir.setNpmMahasiswa(PAPakAmir);
        bambang.setNpmMahasiswa(PAMasBambang);

        System.out.println("Pak " + amir.getNama() + " dengan NIDN: " + amir.getNIDN());
        amir.getNpmMahasiswa();
        System.out.println("Mas " + bambang.getNama() + " dengan NIDN: " + bambang.getNIDN());
        bambang.getNpmMahasiswa();

        Jurusan informatika = new Jurusan("45", "Teknik Informatika");
        Jurusan elektro = new Jurusan("41", "Teknik Elektro");

        Mahasiswa[] mahasiswaInformatika = {doel, jajang};
        Mahasiswa[] mahasiswaElektro = {rina, rano};

        Dosen[] dosenIT = {amir, bambang, desti};
        Dosen[] dosenEletro = {agung, aterminanto};

        informatika.setDosen(dosenIT);
        elektro.setDosen(dosenEletro);

        informatika.setMahasiswa(mahasiswaInformatika);
        elektro.setMahasiswa(mahasiswaElektro);

        informatika.displayInformasi();
        elektro.displayInformasi();
    }
}