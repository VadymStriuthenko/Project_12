package Part_2;
import java.util.Scanner;
public class part_2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Part 2. Decomposition
        try {
            boolean continueProgram;

            do {
                // Get user's name
                String name = getUserString("Hi! What is your name? ");

                // Get user's age
                int age = getUserAge();

                // Print greeting and age information
                showUserInformation(name, age);

                // Ask user whether to continue
                continueProgram = askToContinue();

            } while (continueProgram);

            print("Program finished.");

        } catch (Exception e) {
            print("An error occurred: " + e.getMessage());
        }
    }
    // Part 2.5. Output method
    public static void print(String message) {
        System.out.println(message);
    }
    // Part 2.6. Input method
    public static String getUserString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
    // Method for getting user's age
    public static int getUserAge() {
        System.out.print("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        return age;
    }
    // Part 2.8. Method for displaying user information
    public static void showUserInformation(String name, int age) {
        print("Nice to meet you, " + name + "!");
        if (age >= 18) {
            print("You are an adult.");
        } else {
            print("You are under 18.");
        }
    }
    // Part 2.7. Y/N Dialog method
    public static boolean askToContinue() {
        String answer = getUserString(
                "Do you want to continue? (Y/N): "
        );
        return answer.equalsIgnoreCase("Y");
    }
}