import java.util.Scanner;

public class FactorialCalculator {
    public void calculate(int number) {
        // Local Inner Class
        class Factorial {
            private int n;

            public Factorial(int n) {
                this.n = n;
            }

            public int getResult() {
                int result = 1;
                for (int i = 2; i <= n; i++) {
                    result *= i;
                }
                return result;
            }
        }

        // Membuat objek dari Local Inner Class
        Factorial factorial = new Factorial(number);
        int result = factorial.getResult();
        System.out.println("Faktorial dari " + number + " adalah " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int num = scanner.nextInt();

        FactorialCalculator calculator = new FactorialCalculator();
        calculator.calculate(num);

        scanner.close();
    }
}