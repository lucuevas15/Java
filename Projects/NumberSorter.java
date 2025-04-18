import java.util.Scanner;

public class NumberSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Statements for user inputs
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();
        
        // Invoke created increasing order method
        displaySortedNumbers(num1, num2, num3);

        scanner.close(); // Close the scanner
    }

    // Method to display three numbers in increasing order
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        // Sort the numbers by comparing them and displaying in increasing order
        if (num1 > num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        // Display the numbers in increasing order
        System.out.println("The numbers in increasing order are: " + num1 + ", " + num2 + ", " + num3);
    }
}