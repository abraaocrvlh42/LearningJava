import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }

    public void displayWelcome() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║   SCIENTIFIC CALCULATOR IN JAVA        ║");
        System.out.println("╚════════════════════════════════════════╝\n");
    }

    public void displayMenu() {
        System.out.println("\n┌─────────────────────────────────────┐");
        System.out.println("│         MAIN MENU                   │");
        System.out.println("├─────────────────────────────────────┤");
        System.out.println("│ 1. Basic Operations                 │");
        System.out.println("│ 2. Square Root                      │");
        System.out.println("│ 3. Power                            │");
        System.out.println("│ 4. Logarithms                       │");
        System.out.println("│ 5. Trigonometric Functions          │");
        System.out.println("│ 6. Factorial                        │");
        System.out.println("│ 7. Absolute Value                   │");
        System.out.println("│ 8. Rounding                         │");
        System.out.println("│ 0. Exit                             │");
        System.out.println("└─────────────────────────────────────┘");
        System.out.print("Choose an option: ");
    }

    public void displayBasicOperationsMenu() {
        System.out.println("\n┌─────────────────────────────────────┐");
        System.out.println("│    BASIC OPERATIONS                 │");
        System.out.println("├─────────────────────────────────────┤");
        System.out.println("│ 1. Addition (+)                     │");
        System.out.println("│ 2. Subtraction (-)                  │");
        System.out.println("│ 3. Multiplication (×)               │");
        System.out.println("│ 4. Division (÷)                     │");
        System.out.println("│ 5. Modulo (%)                       │");
        System.out.println("└─────────────────────────────────────┘");
        System.out.print("Choose the operation: ");
    }

    public void displayLogarithmMenu() {
        System.out.println("\n┌─────────────────────────────────────┐");
        System.out.println("│        LOGARITHMS                   │");
        System.out.println("├─────────────────────────────────────┤");
        System.out.println("│ 1. Natural Logarithm (ln)           │");
        System.out.println("│ 2. Base 10 Logarithm (log)          │");
        System.out.println("│ 3. Custom Base Logarithm            │");
        System.out.println("└─────────────────────────────────────┘");
        System.out.print("Choose an option: ");
    }

    public void displayTrigonometricMenu() {
        System.out.println("\n┌─────────────────────────────────────┐");
        System.out.println("│   TRIGONOMETRIC FUNCTIONS           │");
        System.out.println("├─────────────────────────────────────┤");
        System.out.println("│ 1. Sine (sin)                       │");
        System.out.println("│ 2. Cosine (cos)                     │");
        System.out.println("│ 3. Tangent (tan)                    │");
        System.out.println("│ 4. Arc Sine (arcsin)                │");
        System.out.println("│ 5. Arc Cosine (arccos)              │");
        System.out.println("│ 6. Arc Tangent (arctan)             │");
        System.out.println("└─────────────────────────────────────┘");
        System.out.print("Choose an option: ");
    }

    public void displayRoundingMenu() {
        System.out.println("\n┌─────────────────────────────────────┐");
        System.out.println("│      ROUNDING                       │");
        System.out.println("├─────────────────────────────────────┤");
        System.out.println("│ 1. Ceiling (ceil)                   │");
        System.out.println("│ 2. Floor (floor)                    │");
        System.out.println("│ 3. Rounding (round)                 │");
        System.out.println("└─────────────────────────────────────┘");
        System.out.print("Choose an option: ");
    }

    public double requestNumber(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. " + prompt);
            scanner.next();
        }
        double number = scanner.nextDouble();
        scanner.nextLine();
        return number;
    }

    public void displayResult(double result) {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.printf("║  Result: %-29.10f ║%n", result);
        System.out.println("╚════════════════════════════════════════╝");
    }

    public void displayResult(long result) {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.printf("║  Result: %-29d ║%n", result);
        System.out.println("╚════════════════════════════════════════╝");
    }

    public void displayError(String message) {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║  ERROR: " + message);
        System.out.println("╚════════════════════════════════════════╝");
    }

    public void displayInvalidOption() {
        System.out.println("\n⚠ Invalid option! Please try again.");
    }

    public void displayGoodbye() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║  Thank you for using the calculator!   ║");
        System.out.println("╚════════════════════════════════════════╝\n");
    }
}