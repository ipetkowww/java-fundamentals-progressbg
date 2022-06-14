package homework;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter positive number:");
            number = scanner.nextInt();
        } while (number < 0);

        for (int i = 3; i <= number * 3; i += 3) {
            System.out.print(i);
            if (i < number * 3) {
                System.out.print(",");
            }
        }

    }
}
