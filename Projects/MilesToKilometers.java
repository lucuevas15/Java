//This program converts miles into kilometers
public class MilesToKilometers {
    public static void main(String[] args) {
        // Print statement for table headers
        System.out.printf("%-15s%-15s%n", "Miles", "Kilometers");
        
        // Loop for conversions and print statement
        for (int mile = 1; mile <= 10; mile++) {
            double kilometers = mile * 1.609;
            System.out.printf("%-15d%-15.3f%n", mile, kilometers);
        }
    }
}