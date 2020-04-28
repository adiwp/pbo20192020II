package app;
 
// class App {
//     public static void main(String[] args) {
//         AnonymousDemo an = new AnonymousDemo();
//         an.createClass();

//         Polygon pol = new Polygon();
//         pol.display();
//     }
// }

interface PolygonInt {
    public void display();
}
 
class AnonymousDemoInt {
    public void createClass() {
 
        // anonymous class implementing interface
        PolygonInt p1 = new PolygonInt() {
          public void display() {
             System.out.println("Inside an anonymous class.");
          }
        };
        p1.display();
    }
}
 
class App {
    public static void main(String[] args) {
       AnonymousDemoInt an = new AnonymousDemoInt();
       an.createClass();
    }
}