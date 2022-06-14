package homework;

import java.util.Scanner;

public class Task25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter a positive whole number grater than 0:");
            number = scanner.nextInt();
        } while (number <= 0);

        int factorial = 1;
        int n = 2;


        do {
            factorial *= n;
            n++;
        } while (n <= number);

        System.out.println(factorial);
    }
}
