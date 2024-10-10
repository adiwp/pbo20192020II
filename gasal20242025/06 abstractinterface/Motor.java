class Motor extends Vehicle implements Fuelable, Movable {
    public Motor(String name) {
        super(name);
    }

    // Implementasi method abstract dari Vehicle
    public void move() {
        System.out.println(name + " bergerak di tanah gravel.");
    }
}