// Subclass dari Vehicle yang mengimplementasikan Movable dan Fuelable
class Car extends Vehicle implements Movable, Fuelable {
    public Car(String name) {
        super(name);
    }

    // Implementasi method abstract dari Vehicle
    public void move() {
        System.out.println(name + " bergerak di jalan.");
    }

    // Menggunakan default method refuel dari Fuelable tanpa override
    public void refuel() {
        System.out.println(name + "Isi bahan bakar mobil");
    }
}