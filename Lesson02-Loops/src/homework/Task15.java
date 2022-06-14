package homework;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter a positive number grater than 0:");
            number = scanner.nextInt();
        } while (number <= 0);

        int sum = 0;
        int start = 1;

        do {
            sum += start;
            start++;
        } while (start <= number);

        System.out.println(sum);
    }
}
