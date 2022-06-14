package homework;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter a whole number in range [10.. 200]");
            number = scanner.nextInt();
        } while (number < 10 || number > 200);

        for (int i = number; i >= 7; i--) {
            if (i % 7 == 0 && i < number) {
                System.out.println(i);
            }
        }
    }
}
