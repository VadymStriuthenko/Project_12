package Part_3;
import java.util.Scanner;
public class part_3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
        // Part 3. Basic Calculator
        double result = 0;
        boolean usePreviousResult = false;
        boolean continueProgram = true;
        System.out.println("=================================");
        System.out.println("        BASIC CALCULATOR");
        System.out.println("=================================");
        try {
            while (continueProgram) {
                double firstNumber;
                // Use previous result as the first operand
                if (usePreviousResult) {
                    firstNumber = result;
                    System.out.printf("Previous result: %.2f%n", firstNumber);
                } else {
                    firstNumber = getNumber("Enter first number: ");
                }
                String operation = getOperation();
                double secondNumber = getNumber("Enter second number: ");
                // Perform selected operation
                switch (operation) {
                    case "+":
                        result = add(firstNumber, secondNumber);
                        break;

                    case "-":
                        result = subtract(firstNumber, secondNumber);
                        break;

                    case "*":
                        result = multiply(firstNumber, secondNumber);
                        break;

                    case "/":
                        result = divide(firstNumber, secondNumber);
                        break;

                    default:
                        System.out.println("Invalid operation.");
                        continue;
                }

                // Part 3.3. Formatted output
                System.out.printf(
                        "Result: %.2f %s %.2f = %.2f%n",
                        firstNumber,
                        operation,
                        secondNumber,
                        result
                );

                // Ask user to continue
                String answer = getUserString(
                        "Do you want to continue? (Y/N): "
                );

                if (answer.equalsIgnoreCase("Y")) {
                    usePreviousResult = true;
                } else {
                    continueProgram = false;
                }
            }

            System.out.println("Calculator finished.");

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    // Part 3.1. Get number from user
    public static double getNumber(String message) {

        System.out.print(message);

        double number = scanner.nextDouble();
        scanner.nextLine();

        return number;
    }
    // Get operation from user
    public static String getOperation() {
        System.out.print("Enter operation (+, -, *, /): ");
        return scanner.nextLine();
    }
    // Get text input from user
    public static String getUserString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
    // Part 3.2. Addition
    public static double add(double first, double second) {
        return first + second;
    }
    // Part 3.3. Subtraction
    public static double subtract(double first, double second) {
        return first - second;
    }
    // Part 3.4. Multiplication
    public static double multiply(double first, double second) {
        return first * second;
    }
    // Part 3.5. Division
    public static double divide(double first, double second) {

        if (second == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return first / second;
    }
}