package homework;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 0;
        boolean isFirstValid = false;
        boolean isSecondValid = false;

        do {
            if (!isFirstValid) {
                System.out.println("Enter first number:");
                firstNumber = scanner.nextInt();
                if (firstNumber > 0) {
                    isFirstValid = true;
                }
            }
            if (!isSecondValid) {
                System.out.println("Enter second number: ");
                secondNumber = scanner.nextInt();
                if (secondNumber > 0) {
                    isSecondValid = true;
                }
            }

        } while (!isFirstValid || !isSecondValid);

        boolean firstNumLowerThanSecondNum = firstNumber < secondNumber;

        System.out.println("Your input is:");
        System.out.println("first number = " + firstNumber);
        System.out.println("second number = " + secondNumber);
        System.out.println();

        while (!firstNumLowerThanSecondNum) {
            System.out.println("First number should be lower than second");
            System.out.println("Enter first number:");
            firstNumber = scanner.nextInt();
            System.out.println("Enter second number:");
            secondNumber = scanner.nextInt();
            firstNumLowerThanSecondNum = firstNumber < secondNumber;
        }

        int sum = 0;
        for (int i = firstNumber; i <= secondNumber; i++) {
            if (i % 3 == 0) {
                System.out.print("skip " + i + ", ");
                continue;
            }
            System.out.print(i * i);
            sum += i * i;
            if (sum > 200) {
                break;
            }
            System.out.print(", ");
        }

    }
}
