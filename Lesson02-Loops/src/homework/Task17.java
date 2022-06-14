package homework;

import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter number in range [3..20]:");
            number = scanner.nextInt();
            scanner.nextLine();
        } while (number < 3 || number > 20);

        System.out.println("Enter a character:");
        char c = scanner.nextLine().charAt(0);

        for (int i = 1; i <= number; i++) {
            if (i == 1 || i == number) {
                for (int j = 0; j < number; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 0; j < number - 2; j++) {
                    System.out.print(c);
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
