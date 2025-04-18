import java.util.Scanner;

public class RemoveDuplicates {

    // Method to eliminate duplicates from the array
    public static int[] eliminateDuplicates(int[] list) {
        // Temporary array to hold the distinct values
        int[] tempArray = new int[list.length];
        int count = 0; // To track the number of distinct elements
        
        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;
            
            // Check if the current element is already in tempArray
            for (int j = 0; j < count; j++) {
                if (list[i] == tempArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            // If it's not a duplicate, add it to tempArray
            if (!isDuplicate) {
                tempArray[count] = list[i];
                count++;
            }
        }
        
        // Create a new array with the correct size (without duplicates)
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = tempArray[i];
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read 10 integers from the user
        System.out.println("Enter ten numbers: ");
        int[] list = new int[10];
        for (int i = 0; i < 10; i++) {
            list[i] = scanner.nextInt();
        }
        
        // Eliminate duplicates
        int[] distinctNumbers = eliminateDuplicates(list);
        
        // Display the result
        System.out.print("The distinct numbers are: ");
        for (int num : distinctNumbers) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}