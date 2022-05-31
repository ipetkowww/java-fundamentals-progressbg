package homework;

import java.util.Scanner;

public class Task02 {
//  Write a program that receives two ints and compares them in the following way:
//        Receive two ints
//        Print the following input:
//        "Int a is larger than int b" + (...result of comparison...)
//        "Int a is equal to int b" + (...result of comparison...)
//        "Int a is less than int b" + (...result of comparison...)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number:");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is larger than " + secondNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " is less than " + secondNumber);
        } else {
            System.out.println(firstNumber + " is equal to " + secondNumber);
        }
    }
}
