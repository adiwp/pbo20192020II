// Subclass lain dari Vehicle yang mengimplementasikan Movable dan Fuelable
class Boat extends Vehicle implements Movable, Fuelable {
    public Boat(String name) {
        super(name);
    }

    // Implementasi method abstract dari Vehicle
    public void move() {
        System.out.println(name + " bergerak di air.");
    }

    // Override default method refuel dari Fuelable
    public void refuel() {
        System.out.println(name + " mengisi bahan bakar solar khusus kapal.");
    }
}