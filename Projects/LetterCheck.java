import java.util.Scanner;

public class LetterCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to input a letter
        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);

        // input alphabet letter validation
        if (Character.isLetter(letter)) {
           
            // Statements for if the letter is a vowel or consonant
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println(letter + " is a vowel");
            } else {
                System.out.println(letter + " is a consonant");
            }
        } else {
            // Invalid input (non-alphabetical character)
            System.out.println(letter + " is an invalid input");
        }
    }
}