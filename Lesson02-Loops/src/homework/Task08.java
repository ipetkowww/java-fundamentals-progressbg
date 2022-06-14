package homework;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.println("Enter a positive number greater than 0:");
            n = scanner.nextInt();
        } while (n <= 0);

        int number = n - 1;

        for (int i = 0; i < n; i++) {
            System.out.print(number);
            for (int j = 0; j < n - 1; j++) {
                System.out.print("" + number);
            }
            System.out.println();
            number += 2;
        }
    }
}
