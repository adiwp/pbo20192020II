package app;

class AnonymousDemo {
    public void createClass() {
        // creation of anonymous class extending class Polygon
        Polygon p1 = new Polygon() {
           public void display() {
              System.out.println("Inside an anonymous class.");
           }
        };
        p1.display();
    }
}