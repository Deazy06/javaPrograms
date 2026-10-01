import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Summa:    " + (a + b));

        System.out.println("Differens: " + (a - b));

        System.out.println("Produkt:  " + (a * b));

        double kvot = (double) a / b;
        System.out.printf("Kvot:     %.2f%n", kvot);

        System.out.println("Rest:     " + (a % b));

        scanner.close();
    }
}
