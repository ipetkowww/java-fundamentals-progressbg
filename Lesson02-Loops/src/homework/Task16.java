package homework;

import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum;
        int secondNum;
        // validation for first number
        do {
            System.out.println("Enter first number in range [10.. 5555]:");
            firstNum = scanner.nextInt();
        } while (firstNum < 10 || firstNum > 5555);

        // validation for second number
        do {
            System.out.println("Enter second number in range [10.. 5555]:");
            secondNum = scanner.nextInt();
        } while (secondNum < 10 || secondNum > 5555);

        int lowerNum = firstNum < secondNum ? firstNum : secondNum;
        int graterNum = firstNum > secondNum ? firstNum : secondNum;

        for (int i = graterNum; i >= lowerNum; i--) {
            if (i % 50 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
