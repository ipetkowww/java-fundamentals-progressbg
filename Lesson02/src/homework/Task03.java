package homework;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfNumbers = 5;
        System.out.println("You have to enter " + countOfNumbers + " integers:");

        int sum = 0;
        for (int i = 0; i < countOfNumbers; i++) {
            System.out.println("Enter an integer");
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println("Total is: " + sum);
    }
}
