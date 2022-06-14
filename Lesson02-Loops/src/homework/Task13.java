package homework;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter a whole number in range [2.. 27]:");
            number = scanner.nextInt();
        } while (number < 2 || number > 27);

        for (int i = 100; i <= 999; i++) {
            int lastDigit = i % 10;
            int secondDigit = i / 10 % 10;
            int firstDigit = i / 100;
            int sum = lastDigit + secondDigit + firstDigit;
            if (sum == number) {
                System.out.print(i + " ");
            }
        }
    }
}
