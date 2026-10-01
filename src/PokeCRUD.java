import java.util.ArrayList;
import java.util.Scanner;

public class PokeCRUD {

    // Delade resurser för hela klassen
    private static final ArrayList<String> pokedex = new ArrayList<>();
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            printMenu();
            String input = scan.nextLine().trim();

            switch (input) {
                case "1" -> addPokemon();
                case "2" -> updatePokemon();
                case "3" -> deletePokemon();
                case "4" -> listPokemon();
                case "5" -> {
                    System.out.println("Avslutar Pokemon databasen...");
                    running = false;
                }
                default -> System.out.println("Ogiltigt val, ange en siffra mellan 1 och 5.");
            }
        }
        scan.close();
    }

    private static void printMenu() {
        System.out.println("""
                
                 --- Pokemon Index ---
                1. Skapa ny Pokemon
                2. Uppdatera en Pokemon
                3. Ta bort Pokemon
                4. Lista alla Pokemon
                5. Avsluta
                Vad vill du göra? Ange 1-5:""");
    }

    private static void addPokemon() {
        System.out.println("-_-_-_-_-_-_-_-_-");
        System.out.println("SKAPA NY POKEMON");
        System.out.println("-_-_-_-_-_-_-_-_-");
        System.out.print("Vad heter den nya pokemonen: ");

        String newPokemon = scan.nextLine().trim();

        if (newPokemon.isEmpty()) {
            System.out.println("Namnet kan inte vara tomt!");
            return;
        }

        pokedex.add(newPokemon);
        System.out.println(newPokemon + " har lagts till!");
    }

    private static void updatePokemon() {
        System.out.println("*****************");
        System.out.println("UPPDATERA POKEMON");
        System.out.println("*****************");

        if (pokedex.size() == 0) {
            System.out.println("Det finns inga Pokemon att uppdatera.");
        } else {
            for (int i = 0; i < pokedex.size(); i++) {
                System.out.println((i + 1) + ". " + pokedex.get(i));
            }

            System.out.print("Ange nummer att uppdatera: ");
            int indexToUpdate = Integer.parseInt(scan.nextLine()) - 1;

            if (indexToUpdate >= 0 && indexToUpdate < pokedex.size()) {
                System.out.print("Ändra " + pokedex.get(indexToUpdate) + " till: ");
                String newName = scan.nextLine();
                pokedex.set(indexToUpdate, newName);
                System.out.println("Uppdaterat!");
            } else {
                System.out.println("Ogiltigt nummer.");
            }
        }
    }

    private static void deletePokemon() {
        System.out.println("-----------------");
        System.out.println("TA BORT POKEMON");
        System.out.println("-----------------");

        if (pokedex.size() == 0) {
            System.out.println("Det finns inga Pokemon att ta bort.");
        } else {
            for (int i = 0; i < pokedex.size(); i++) {
                System.out.println((i + 1) + ". " + pokedex.get(i));
            }

            System.out.print("Ange nummer att ta bort: ");
            int indexToDelete = Integer.parseInt(scan.nextLine()) - 1;

            if (indexToDelete >= 0 && indexToDelete < pokedex.size()) {
                String removed = pokedex.remove(indexToDelete);
                System.out.println(removed + " har tagits bort!");
            } else {
                System.out.println("Ogiltigt nummer.");
            }
        }
    }

    private static void listPokemon() {
        if (pokedex.isEmpty()) {
            System.out.println("Inga Pokemon finns i databasen.");
            return;
        }
        System.out.println("\n--- Alla Pokemon ---");
        for (int i = 0; i < pokedex.size(); i++) {
            System.out.println((i + 1) + ". " + pokedex.get(i));
        }
    }
}