import java.util.Scanner;

// This program calculates the tuition for a university in 10 years at a 5% increase
// and calculates the 4 year total tuition after the 10 year increase
public class TuitionCalculator {
    public static void main(String[] args) {
        double tuition = 10000; // initial tuition
        double rate = 0.05;     // 5% annual increase

        // Calculate tuition in 10 years
        for (int year = 1; year <= 10; year++) {
            tuition += tuition * rate;
        }

        System.out.printf("Tuition in 10 years: $%.2f%n", tuition);

        // Calculate total cost for 4 years after the 10th year total
        double totalCost = 0;
        for (int i = 0; i < 4; i++) {
            totalCost += tuition;
            tuition += tuition * rate; // yearly increase
        }

        System.out.printf("Total cost for 4 years after 10th year: $%.2f%n", totalCost);
    }
}
