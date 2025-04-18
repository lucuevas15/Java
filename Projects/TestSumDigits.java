import java.util.Scanner;

public class TestSumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // User input statement
            System.out.print("Enter a number (or type 'exit' to quit): ");
            
            // Evaluate the input
            String input = scanner.nextLine();
            
            //If statement for if the user wants to exit
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;  
            }
            
            // Try to convert the input to a long integer
            try {
                long number = Long.parseLong(input);
                // Call the created sumDigits method
                System.out.println("The sum of the digits of " + number + " is: " + sumDigits(number));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        
        // Close the scanner when done
        scanner.close();  
    }

    // Method to compute the sum of digits
    public static int sumDigits(long n) {
        int sum = 0;
        
        // Loop until n is greater than 0
        while (n > 0) {
            // Extract the last digit using % operator
            sum += n % 10;
            
            // Remove the last digit using / operator
            n = n / 10;
        }
        
        return sum;
    }
}