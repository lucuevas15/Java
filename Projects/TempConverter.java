import java.util.Scanner;
//Java program that converts input Celcius temperatures into Fahrenheit
public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // User Input in Celcius
            System.out.print("Enter the temperature in Celsius (or type 'exit' to quit): ");

            // If statement to check for exit
            if (scanner.hasNextDouble()) {
                double celsius = scanner.nextDouble();

                // Conversion Formula
                double fahrenheit = (9.0 / 5) * celsius + 32;

                // Output Result of Celsius in Fahrenheit
                System.out.printf("%.1f Celsius in Fahrenheit is %.1f%n degrees", celsius, fahrenheit);
            } 
            // Else if statement for exit option
            else if (scanner.hasNext("exit")) {
                System.out.println("Exiting program...");
                break;
            // Else statement for invalid entries
            } else {
                System.out.println("Invalid input. Please enter a number or type 'exit' to quit.");
                scanner.next();
            }
        }

        scanner.close();
    }
}