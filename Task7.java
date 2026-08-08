import java.util.Scanner;

public class Task7 {

    // ✅ Addition method with return type
    public static double add(double a, double b) {
        return a + b;
    }

    // ✅ Subtraction method with return type
    public static double subtract(double a, double b) {
        return a - b;
    }

    // ✅ Multiplication method with return type
    public static double multiply(double a, double b) {
        return a * b;
    }

    // ✅ Division method — handles division by zero gracefully
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Quotient: Cannot divide by zero");
            return Double.NaN; // Return "Not a Number" to avoid crash
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept two numbers from user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        scanner.close();

        // Call each method and print results
        System.out.println("Sum: " + add(num1, num2));
        System.out.println("Difference: " + subtract(num1, num2));
        System.out.println("Product: " + multiply(num1, num2));

        // Division — only print if not zero
        double quotient = divide(num1, num2);
        if (!Double.isNaN(quotient)) {
            System.out.println("Quotient: " + quotient);
        
        }
    }
}