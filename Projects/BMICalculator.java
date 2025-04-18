// The below program allows users to input their specific height and weight
// including fractional measurements in decimal form, then calculates BMI and BMI type
public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;

        do {
            // Input statements for user height and weight
            System.out.print("Enter weight in pounds(include decimals): ");
            double weight = input.nextDouble();

            System.out.print("Enter feet: ");
            int feet = input.nextInt();

            System.out.print("Enter inches (include decimals): ");
            double inches = input.nextDouble();

            // Formula for total height into inches
            double totalInches = (feet * 12) + inches;

            // Formula for height from inches to meters
            double heightInMeters = totalInches * 0.0254;

            // Formula for weight from pounds to kilos
            double weightInKg = weight * 0.45359237;

            // Formula to interpret BMI
            double bmi = weightInKg / (heightInMeters * heightInMeters);

            // Display BMI percentage
            System.out.printf("BMI is %.2f%n", bmi);

            // Interpret BMI output
            if (bmi < 18.5) {
                System.out.println("Underweight");
            } else if (bmi < 25) {
                System.out.println("Normal");
            } else if (bmi < 30) {
                System.out.println("Overweight");
            } else if (bmi < 40) {
                System.out.println("Obese");
            } else {
                System.out.println("Morbidly Obese");
            }

            // User input for additional entry
            System.out.print("Do you want to enter another? (yes/no): ");
            input.nextLine(); // Consume the leftover newline
            choice = input.nextLine().trim().toLowerCase();

        } while (choice.equals("yes") || choice.equals("y"));

        //End program statement
        System.out.println("Thank you for using the BMI Calculator.");
        input.close();
    }
}
