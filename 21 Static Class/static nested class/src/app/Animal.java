package app;

class Animal {

    // inner class
    class Reptile {
        public void displayInfo() {
            System.out.println("I am a reptile.");
        }
    }
    
    // static class
    static class Mammal {
        public void displayInfo() {
            System.out.println("I am a mammal.");
        }
    }
}