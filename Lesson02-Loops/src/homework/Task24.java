package homework;

import java.util.Scanner;

public class Task24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter whole number in range [10..30000]");
            number = scanner.nextInt();
        } while (number < 10 || number > 30000);

        int x = number;
        int newNumber = 0;

        do {
            int lastDigit = x % 10;
            newNumber = newNumber * 10 + lastDigit;
            x /= 10;
        } while (x > 0);

        if (newNumber == number) {
            System.out.println("The number " + number + " is palindrome.");
        } else {
            System.out.println("The number " + number + " is not palindrome.");
        }
    }
}
