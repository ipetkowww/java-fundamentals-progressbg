package homework;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();

        int lowerNumber = firstNumber < secondNumber ? firstNumber : secondNumber;
        int greaterNumber = firstNumber > secondNumber ? firstNumber : secondNumber;

        for (int i = lowerNumber; i <= greaterNumber; i++) {
            System.out.print(i + " ");
        }
    }
}
