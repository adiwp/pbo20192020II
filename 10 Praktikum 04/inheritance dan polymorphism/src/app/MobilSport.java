package app;

class MobilSport {
    private String nama;

    public MobilSport(String nama) {
        this.nama = nama;
    }

    public void gigi(int g) {
        System.out.println(this.nama + " masuk gigi ke-" + g);
    }

    public void gigi(int g, int t) {
        System.out.println(this.nama + " masuk gigi ke-" + g + " dengan turbo " + t);
    }
}