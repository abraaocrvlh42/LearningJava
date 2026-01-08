public class Calculator {

    // Basic operations
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public double modulo(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Modulo by zero is not allowed");
        }
        return a % b;
    }

    // Powers and roots
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double squareRoot(double number) {
        if (number < 0) {
            throw new ArithmeticException("Square root of negative number");
        }
        return Math.sqrt(number);
    }

    // Logarithms
    public double naturalLog(double number) {
        if (number <= 0) {
            throw new ArithmeticException("Logarithm of non-positive number");
        }
        return Math.log(number);
    }

    public double log10(double number) {
        if (number <= 0) {
            throw new ArithmeticException("Logarithm of non-positive number");
        }
        return Math.log10(number);
    }

    public double logBase(double number, double base) {
        if (number <= 0 || base <= 0 || base == 1) {
            throw new ArithmeticException("Invalid values for logarithm");
        }
        return Math.log(number) / Math.log(base);
    }

    // Trigonometric functions
    public double sin(double degrees) {
        return Math.sin(Math.toRadians(degrees));
    }

    public double cos(double degrees) {
        return Math.cos(Math.toRadians(degrees));
    }

    public double tan(double degrees) {
        return Math.tan(Math.toRadians(degrees));
    }

    public double arcsin(double value) {
        if (value < -1 || value > 1) {
            throw new ArithmeticException("Value outside arcsin domain");
        }
        return Math.toDegrees(Math.asin(value));
    }

    public double arccos(double value) {
        if (value < -1 || value > 1) {
            throw new ArithmeticException("Value outside arccos domain");
        }
        return Math.toDegrees(Math.acos(value));
    }

    public double arctan(double value) {
        return Math.toDegrees(Math.atan(value));
    }

    // Other functions
    public long factorial(int n) {
        if (n < 0) {
            throw new ArithmeticException("Factorial of negative number");
        }
        if (n > 20) {
            throw new ArithmeticException("Number too large for factorial");
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public double absolute(double number) {
        return Math.abs(number);
    }

    public double ceil(double number) {
        return Math.ceil(number);
    }

    public double floor(double number) {
        return Math.floor(number);
    }

    public double round(double number) {
        return Math.round(number);
    }
}