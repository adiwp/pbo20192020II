// Subclass dari Vehicle yang tidak bisa bergerak dan tidak perlu bahan bakar
class Building extends Vehicle {
    public Building(String name) {
        super(name);
    }

    // Building tidak mengimplementasikan Movable atau Fuelable
    // Tidak perlu implementasi move() atau refuel()
}