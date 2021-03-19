package app;

public class Luar {
    private String outerVariable = "Variabel luar";

    class Dalam {
        String innerVariable = "Variabel dalam";

        public void bicara() {
            System.out.println(innerVariable);
            System.out.println(outerVariable);
        }
    }
}