package homework;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter whole positive number greater than 0:");
            number = scanner.nextInt();
        } while (number < 0);

        for (int i = 1; i <= number; i++) {
            for (int j = i; j < number; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
