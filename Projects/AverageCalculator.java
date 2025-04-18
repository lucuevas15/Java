import java.util.Scanner;
// This program calculates the average of 10 double values
public class AverageCalculator {
    
    // Method for average of an integer array
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method for average of a double array
    public static double average(double[] array) {
        double sum = 0.0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for user input
        System.out.println("Enter 10 double values:");
        double[] doubleArray = new double[10];
        for (int i = 0; i < 10; i++) {
            doubleArray[i] = scanner.nextDouble();
        }

        // Calculate and display the average
        double doubleAverage = average(doubleArray);
        System.out.println("The average of the entered double values is: " + doubleAverage);
        
        scanner.close();
    }
}