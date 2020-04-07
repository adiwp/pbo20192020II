package app;

public class App {
    public static void main(String[] args) throws Exception {
        Spider laba2Imut = new Spider();
        laba2Imut.eat();

        Dog doggy = new Dog();
        doggy.setName("Doggy");
        System.out.println("Saya adalah " + doggy.getName());
        doggy.play();
        doggy.eat();
        doggy.walk();

        Cat kimung = new Cat("Kimung");
        System.out.println("Saya adalah " + kimung.getName());
        kimung.play();
        kimung.eat();
        kimung.walk();
    }
}