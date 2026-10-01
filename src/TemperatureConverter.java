import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // temperatur
        System.out.print("Ange temperatur i Celsius: ");
        double celsius = scanner.nextDouble();

        //  Fahrenheit
        double fahrenheit = celsius * 9 / 5 + 32;

        //  Kelvin
        double kelvin = celsius + 273.15;

        // Utskrift
        System.out.printf("%.1f°C är %.1f°F och %.2f K%n",
                celsius, fahrenheit, kelvin);

        scanner.close();
    }
}
