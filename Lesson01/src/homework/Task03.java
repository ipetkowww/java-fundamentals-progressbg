package homework;

import java.util.Scanner;

public class Task03 {
//Write a program that receives an int and prints if it is an odd number.
//        Example: input is 4
//        Output: "4 is not an odd number"
//
//        Example: input is 3
//        Output: "3 is an odd number"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Invalid input");
        } else {
            if (number == 0) {
                System.out.println("0 is not even or odd number");
            } else {
                if (number % 2 == 1) {
                    System.out.println(number + " is an odd number");
                } else {
                    System.out.println(number + " is not an odd number");
                }
            }
        }
    }
}
