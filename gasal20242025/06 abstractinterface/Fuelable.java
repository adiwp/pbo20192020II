// Interface dengan default method untuk mengisi bahan bakar
interface Fuelable {
    default void refuel() {
        System.out.println("Mengisi bahan bakar umum.");
    }
}