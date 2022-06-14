package homework;

import java.util.Scanner;

public class Task19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.println("Enter number in range [10..99]:");
            num = scanner.nextInt();
        } while (num < 10 || num > 99);

        while (num != 1) {
            if (num % 2 == 0) {
                num *= 0.5;
            } else {
                num = (num * 3) + 1;
            }
            System.out.print(num + " ");
        }
    }
}
