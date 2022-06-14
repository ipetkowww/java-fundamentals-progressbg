package homework;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();

        int sum = 0;
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
        } else {
            for (int i = 1; i >= number; i--) {
                sum += i;
            }
        }

        System.out.println("Result is " + sum);
    }
}
