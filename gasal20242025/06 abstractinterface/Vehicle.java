// Abstract class
abstract class Vehicle {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    // Method umum yang bisa digunakan semua kendaraan
    public void showInfo() {
        System.out.println("Kendaraan: " + name);
    }
}