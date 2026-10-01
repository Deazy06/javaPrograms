import java.util.Arrays;

public class listArrayApp {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int[] numbers2 ={2, 77 ,114};
        String[] names = {"Anna", "Bertil", "Cecilia"};

        numbers[0] = 5;
        numbers[1] = 12;
        numbers[2] = 7;

        for (int i = 0; i < names.length; i++) {
            System.out.println("index " + "håller namnet: " + names[i]);
        }

        String userName = "Bertil";
        for(String name:names){
            if (name.equalsIgnoreCase(userName)){
                System.out.println(userName + " finns i DB");

            } else {
                System.out.println(userName + " finns inte i DB");
            }
        }

        for(String name:names){
            System.out.println(name);
        }

        System.out.println(numbers.length);
        System.out.println(numbers2.length);
        System.out.println(numbers2[2]);
    }
}
