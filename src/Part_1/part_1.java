package Part_1;
public class part_1 {
    public static void main(String[] args) {
        // Part 1.1. Methods with different arguments and types
        // Method with 0 arguments
        sayHello();
        // Method with 1 argument
        printName("Alex");
        // Method with 2 arguments of different types
        printStudentInfo("Alex", 17);
        // Method with 3 arguments of different types
        showResult("Math", 95, true);
        // Part 1.2. Method without return value
        printMessage("This method does not return a value.");
        // Part 1.3. Methods with different return types
        int sum = addNumbers(10, 20);
        System.out.println("Sum: " + sum);
        double average = calculateAverage(80, 90, 100);
        System.out.println("Average: " + average);
        String greeting = createGreeting("Alex");
        System.out.println(greeting);
        boolean adult = isAdult(18);
        System.out.println("Is adult: " + adult);
        // Part 1.4. Decomposition into methods
        runStudentProgram();
    }
    // Method with 0 arguments
    public static void sayHello() {
        System.out.println("Hello!");
    }
    // Method with 1 argument
    public static void printName(String name) {
        System.out.println("Name: " + name);
    }
    // Method with 2 arguments of different types
    public static void printStudentInfo(String name, int age) {
        System.out.println("Student: " + name + ", Age: " + age);
    }
    // Method with 3 arguments of different types
    public static void showResult(String subject, int mark, boolean passed) {
        System.out.println(
                "Subject: " + subject +
                        ", Mark: " + mark +
                        ", Passed: " + passed
        );
    }
    // Method without return value
    public static void printMessage(String message) {
        System.out.println(message);
    }
    // Method returning int
    public static int addNumbers(int first, int second) {
        return first + second;
    }
    // Method returning double
    public static double calculateAverage(int first, int second, int third) {
        return (first + second + third) / 3.0;
    }
    // Method returning String
    public static String createGreeting(String name) {
        return "Welcome, " + name + "!";
    }
    // Method returning boolean
    public static boolean isAdult(int age) {
        return age >= 18;
    }
    // Part 1.4. Decomposition into methods
    public static void runStudentProgram() {
        System.out.println("\n--- Student Program ---");

        String name = getStudentName();
        int age = getStudentAge();

        showStudentData(name, age);
    }

    // Sub-method called from runStudentProgram()
    public static String getStudentName() {
        return "Alex";
    }
    // Sub-method called from runStudentProgram()
    public static int getStudentAge() {
        return 17;
    }
    // Sub-method called from runStudentProgram()
    public static void showStudentData(String name, int age) {
        printStudentInfo(name, age);

        // Calling another custom method inside this method
        if (isAdult(age)) {
            printMessage("The student is an adult.");
        } else {
            printMessage("The student is under 18.");
        }
    }
}