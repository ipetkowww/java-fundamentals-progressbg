package homework;

import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum;
        int secondNum;

        do {
            System.out.println("Enter first number in range [1..10]");
            firstNum = scanner.nextInt();
        } while (firstNum < 1 || firstNum > 10);

        do {
            System.out.println("Enter second number in range [1..10]");
            secondNum = scanner.nextInt();
        } while (secondNum < 1 || secondNum > 10);

        for (int i = 1; i <= firstNum; i++) {
            for (int j = 1; j <= secondNum; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
