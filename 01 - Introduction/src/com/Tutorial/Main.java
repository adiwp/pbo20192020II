package com.Tutorial;

class Mahasiswa {
    String nama;
    String npm;

    Mahasiswa(String nama, String npm) {
        this.nama = nama;
        this.npm = npm;
    }

    void display() {
        System.out.println(this.nama);
        System.out.println(this.npm);
    }
}

class Dosen {
    String nama;
    String nidn;

    Dosen(String nama, String nidn) {
        this.nama = nama;
        this.nidn = nidn;
    }

    void display() {
        System.out.println(this.nama);
        System.out.println(this.nidn);
    }
}

class MataKuliah {
    String nama;
    String kodemk;

    MataKuliah(String nama, String kodemk) {
        this.nama = nama;
        this.kodemk = kodemk;
    }

    void display() {
        System.out.println(this.nama);
        System.out.println(this.kodemk);
    }
}

public class Main{
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Diah", "12345");
        Dosen dosen1 = new Dosen("Amir Murtako", "3233");
        MataKuliah mk1 = new MataKuliah("PBO", "112233");

        mhs1.display();
        dosen1.display();
        mk1.display();
    }
}