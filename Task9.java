import static java.lang.Math.*;

public class Task9 {

    public static int add(int a, int b) {
        // Your code here
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        // Your code here
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        // Your code here
        return multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
       // floorDiv returns int → cast to float to match method signature
        return (float) floorDiv(a, b);
    }

    public static void main(String[] args) {
        // Sample values to demonstrate
        int num1 = 10;
        int num2 = 5;

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
    }
}