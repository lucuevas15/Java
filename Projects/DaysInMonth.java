import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for user month input
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();

        // Prompt for user year input
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        //Identity for Month and Days
        String monthName;
        int numberOfDays;

        //Cases for each month and its days
        switch (month) {
            case 1:
                monthName = "January";
                numberOfDays = 31;
                break;
            case 2:
                monthName = "February";
                // Check for February leap year
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    numberOfDays = 29;
                } else {
                    numberOfDays = 28;
                }
                break;
            case 3:
                monthName = "March";
                numberOfDays = 31;
                break;
            case 4:
                monthName = "April";
                numberOfDays = 30;
                break;
            case 5:
                monthName = "May";
                numberOfDays = 31;
                break;
            case 6:
                monthName = "June";
                numberOfDays = 30;
                break;
            case 7:
                monthName = "July";
                numberOfDays = 31;
                break;
            case 8:
                monthName = "August";
                numberOfDays = 31;
                break;
            case 9:
                monthName = "September";
                numberOfDays = 30;
                break;
            case 10:
                monthName = "October";
                numberOfDays = 31;
                break;
            case 11:
                monthName = "November";
                numberOfDays = 30;
                break;
            case 12:
                monthName = "December";
                numberOfDays = 31;
                break;
            
            //Statement for invalid entries
                default:
                System.out.println("Invalid month. Please enter a value between 1 and 12.");
                return;
        }

        // Output for days in the month
        System.out.println(monthName + " " + year + " had " + numberOfDays + " days.");
    }
}
