import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner object to receive user input
        Scanner scanner = new Scanner(System.in);
        double number1, number2, result;
        char operation;

        System.out.println("--- Simple Calculator in Java ---");

        // 1. Receive the first number
        System.out.print("Enter the first number: ");
        // Ensures the input is treated as a double
        if (scanner.hasNextDouble()) {
            number1 = scanner.nextDouble();
        } else {
            System.out.println("Invalid input. Please enter a number.");
            scanner.close();
            return; // Exit the program
        }

        // 2. Receive the operation
        System.out.print("Choose the operation (+, -, *, /): ");
        String operationInput = scanner.next();
        if (operationInput.length() == 1) {
            operation = operationInput.charAt(0);
        } else {
            System.out.println("Invalid input. Please enter only one operation character (+, -, *, /).");
            scanner.close();
            return; // Exit the program
        }

        // 3. Receive the second number
        System.out.print("Enter the second number: ");
        if (scanner.hasNextDouble()) {
            number2 = scanner.nextDouble();
        } else {
            System.out.println("Invalid input. Please enter a number.");
            scanner.close();
            return; // Exit the program
        }

        // Switch structure to execute the operation based on the user's choice
        switch (operation) {
            case '+':
                result = number1 + number2;
                System.out.println("Addition Result: " + number1 + " + " + number2 + " = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println("Subtraction Result: " + number1 + " - " + number2 + " = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println("Multiplication Result: " + number1 + " * " + number2 + " = " + result);
                break;

            case '/':
                // Handle division by zero
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Division Result: " + number1 + " / " + number2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operation. Please use +, -, *, or /.");
                break;
        }

        // Close the Scanner object
        scanner.close();
    }
}