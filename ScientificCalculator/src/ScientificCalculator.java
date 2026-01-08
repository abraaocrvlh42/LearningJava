import java.util.Scanner;

public class ScientificCalculator {
    private final Scanner scanner;
    private final Calculator calculator;
    private final UserInterface ui;
    private boolean running;

    public ScientificCalculator() {
        this.scanner = new Scanner(System.in);
        this.calculator = new Calculator();
        this.ui = new UserInterface();
        this.running = true;
    }

    public void run() {
        ui.displayWelcome();

        while (running) {
            ui.displayMenu();
            processUserChoice();
        }

        scanner.close();
        ui.displayGoodbye();
    }

    private void processUserChoice() {
        String choice = scanner.nextLine().trim();

        try {
            switch (choice) {
                case "1": performBasicOperation(); break;
                case "2": performSquareRoot(); break;
                case "3": performPower(); break;
                case "4": performLogarithm(); break;
                case "5": performTrigonometric(); break;
                case "6": performFactorial(); break;
                case "7": performAbsolute(); break;
                case "8": performRounding(); break;
                case "0": running = false; break;
                default: ui.displayInvalidOption();
            }
        } catch (Exception e) {
            ui.displayError(e.getMessage());
        }
    }

    private void performBasicOperation() {
        ui.displayBasicOperationsMenu();
        String op = scanner.nextLine().trim();

        double num1 = ui.requestNumber("First number: ");
        double num2 = ui.requestNumber("Second number: ");

        double result = switch (op) {
            case "1" -> calculator.add(num1, num2);
            case "2" -> calculator.subtract(num1, num2);
            case "3" -> calculator.multiply(num1, num2);
            case "4" -> calculator.divide(num1, num2);
            case "5" -> calculator.modulo(num1, num2);
            default -> throw new IllegalArgumentException("Invalid operation");
        };

        ui.displayResult(result);
    }

    private void performSquareRoot() {
        double num = ui.requestNumber("Enter the number: ");
        double result = calculator.squareRoot(num);
        ui.displayResult(result);
    }

    private void performPower() {
        double base = ui.requestNumber("Base: ");
        double exponent = ui.requestNumber("Exponent: ");
        double result = calculator.power(base, exponent);
        ui.displayResult(result);
    }

    private void performLogarithm() {
        ui.displayLogarithmMenu();
        String choice = scanner.nextLine().trim();

        double num = ui.requestNumber("Enter the number: ");

        double result = switch (choice) {
            case "1" -> calculator.naturalLog(num);
            case "2" -> calculator.log10(num);
            case "3" -> {
                double base = ui.requestNumber("Logarithm base: ");
                yield calculator.logBase(num, base);
            }
            default -> throw new IllegalArgumentException("Invalid option");
        };

        ui.displayResult(result);
    }

    private void performTrigonometric() {
        ui.displayTrigonometricMenu();
        String choice = scanner.nextLine().trim();

        double angle = ui.requestNumber("Angle in degrees: ");

        double result = switch (choice) {
            case "1" -> calculator.sin(angle);
            case "2" -> calculator.cos(angle);
            case "3" -> calculator.tan(angle);
            case "4" -> calculator.arcsin(angle);
            case "5" -> calculator.arccos(angle);
            case "6" -> calculator.arctan(angle);
            default -> throw new IllegalArgumentException("Invalid option");
        };

        ui.displayResult(result);
    }

    private void performFactorial() {
        int num = (int) ui.requestNumber("Enter an integer: ");
        long result = calculator.factorial(num);
        ui.displayResult(result);
    }

    private void performAbsolute() {
        double num = ui.requestNumber("Enter the number: ");
        double result = calculator.absolute(num);
        ui.displayResult(result);
    }

    private void performRounding() {
        ui.displayRoundingMenu();
        String choice = scanner.nextLine().trim();

        double num = ui.requestNumber("Enter the number: ");

        double result = switch (choice) {
            case "1" -> calculator.ceil(num);
            case "2" -> calculator.floor(num);
            case "3" -> calculator.round(num);
            default -> throw new IllegalArgumentException("Invalid option");
        };

        ui.displayResult(result);
    }
}