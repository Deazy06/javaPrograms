import java.util.Scanner;

public class Veckodagskoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //(index 0 = Måndag, index 6 = Söndag)
        String[] veckodagar = {"Måndag", "Tisdag", "Onsdag", "Torsdag", "Fredag", "Lördag", "Söndag"};

        System.out.print("Skriv ett tal (1-7): ");
        int tal = scanner.nextInt();

        if (tal >= 1 && tal <= 7) {
            // (justerat med -1 eftersom arrayer startar på 0)
            String veckodag = veckodagar[tal - 1];

            // Switch expression
            String dagstyp = switch (tal) {
                case 1, 2, 3, 4, 5 -> "vardag";
                case 6, 7 -> "helg";
                default -> "okänd typ";
            };

            // Skriver ut resultatet tillsammans med dagens namn
            System.out.println(veckodag + " är en " + dagstyp + ".");
        } else {
            System.out.println("Fel: Du måste mata in ett tal mellan 1 och 7.");
        }

        scanner.close();
    }
}
