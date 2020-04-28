package app;

class App {
    public static void main(String[] args) {
    // object creation of the outer class
    Animal animal = new Animal();
        
    // object creation of the non-static class
    Animal.Reptile reptile = animal.new Reptile();
    reptile.displayInfo();
        
    // object creation of the static nested class
    Animal.Mammal mammal = new Animal.Mammal();
    mammal.displayInfo();
        
    }
}