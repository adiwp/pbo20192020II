package app;

public class App {
    /* contoh akses static variable dan static method
     * yang diakses langsung dari dalam Class sendiri
     */
    
    // static variable
    static int age;
    // static method
    static void display() {
        System.out.println("Static Method");
    }

    /* 
     * contoh static blocks, inisiasi variabel a dan b
     */
    static int a = 23;
    static int b;
    static int max;

    // static blocks
    static {
        System.out.println("First Static block.");
        b = a * 4;
    }
    static {
        System.out.println("Second Static block.");
        max = 30;
    }

    // static method
    static void displaystatic() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("max = " + max);
    }

    public static void main(String[] args) throws Exception {
        // accessing the methods of the Math class
        System.out.println("Absolute value of -12 =  " + Math.abs(-12));
        System.out.println("Value of PI = " + Math.PI);
        System.out.println("Value of E = " + Math.E);
        System.out.println("2^2 = " + Math.pow(2,2));

        StaticTest st = new StaticTest();
        // call the nonstatic method
        System.out.println(" 2 * 2 = " + st.multiply(2,2));
        // call the static method
        System.out.println(" 2 + 3 = " + StaticTest.add(2,3));

        Test obj = new Test();
        // access the non-static variable
        System.out.println("min + 1 = " + (obj.min + 1));
        // access the static variable
        System.out.println("max + 1 = " + (Test.max + 1));

        // access the static variable
        // dari dalam Class sendiri (Class App)
        age = 30;
        System.out.println("Age is " + age);
        // access the static method
        display();

        // implementasi static blocks
        displaystatic();
    }
}