package exercise_in_class;

import java.util.Scanner;

public class Exercise07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPIN = "0000";
        String userInput;
        boolean isValidPin;
        int userTries = 1;

        do {
            System.out.println("Please enter pin:");
            userInput = scanner.nextLine();
            isValidPin = userInput.equals(correctPIN);
            if (!isValidPin) {
                if (userTries == 3) {
                    System.out.println("Sorry but you have been locked out.");
                    break;
                } else if (userInput.length() != 4) {
                    System.out.println("Invalid PIN, must be 4 characters.");
                } else {
                    System.out.println("Incorrect, try again.");
                }
            }
            userTries++;
        } while (!isValidPin);

        if (isValidPin) {
            System.out.println("Correct, welcome back.");
        }
    }
}
