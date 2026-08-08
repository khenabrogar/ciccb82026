import java.util.Scanner;

public class Task4 {
   public static void main(String[] args) {
        // Step 1: Accept string input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        // Step 2: Use StringBuilder to reverse the input string
        StringBuilder reversedBuilder = new StringBuilder(input);
        String reversedInput = reversedBuilder.reverse().toString();

        // Step 3: Compare using .equals()
        if (input.equals(reversedInput)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    }
}