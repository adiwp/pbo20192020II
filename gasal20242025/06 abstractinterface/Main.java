public class Main {
    public static void main(String[] args) {
        // Membuat objek Car dan Boat
        Car myCar = new Car("Mobil Sport");
        Boat myBoat = new Boat("Perahu Motor");
        Motor myMotor = new Motor("Motor Gravel");
        Building myBuilding = new Building("Gedung Tinggi");

        // Menampilkan informasi dan menggerakkan kendaraan
        myCar.showInfo();
        myCar.move();
        myCar.refuel();

        System.out.println();  // Pembatas antar output

        myBoat.showInfo();
        myBoat.move();
        myBoat.refuel();

        System.out.println();  // Pembatas antar output

        myMotor.showInfo();
        myMotor.move();
        myMotor.refuel();

        System.out.println();  // Pembatas antar output

        myBuilding.showInfo();
        // myBuilding.move();    // Tidak bisa dipanggil karena Building tidak mengimplementasikan Movable
        // myBuilding.refuel();  // Tidak bisa dipanggil karena Building tidak mengimplementasikan Fuelable
    }
}