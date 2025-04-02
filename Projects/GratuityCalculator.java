import java.util.Scanner;

public class GratuityCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    while (true) {
        // Input statement for subtotal
        System.out.print("Enter the subtotal (or type 'exit' to quit): ");
        
        // If statement to check for exit
        if (scanner.hasNextDouble()) {
            double subtotal = scanner.nextDouble();

            // Input statement for gratuity rate
            System.out.print("Enter the gratuity rate (as a percentage): ");
            double gratuityRate = scanner.nextDouble();

            // Formula for gratuity only
            double gratuity = subtotal * (gratuityRate / 100);

            // Formula for final total
            double total = subtotal + gratuity;

            // Output statements for gratuity and total
            System.out.printf("The gratuity is: $%.2f%n", gratuity);
            System.out.printf("The total is: $%.2f%n", total);
        }

        // Else if statement for exit option
     else if (scanner.hasNext("exit")) {
            System.out.println("Exiting program...");
            break;
       // Else statement for invalid entries
    } else {
        System.out.println("Invalid input. Please enter a value or type 'exit' to quit.");
        scanner.next();
         }
        }

        scanner.close();
    }
}