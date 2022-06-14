package homework;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter positive number equal or grater than 2:");
            number = scanner.nextInt();
        } while (number < 2);

        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("number " + number + " is prime");
        } else {
            System.out.println("number " + number + " is not prime");
        }
    }
}
