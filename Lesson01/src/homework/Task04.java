package homework;

import java.util.Scanner;


public class Task04 {
    //Continued from the previous exercise – mention if the number is positive and odd.
//        Examples:
//        Input: 4
//        Output: "4 is a positive non-odd number"
//
//        Input: 3
//        Output: "3 is a positive odd number"
//
//        Input: -3
//        Output: "-3 is a negative add number"
//
//        Input –4
//        Output: "-4 is a negative non-odd number"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        int number = scanner.nextInt();

        String positiveOrNegative = number >= 0 ? "positive" : "negative";

        if (number == 0) {
            System.out.println("0 is not even or odd number");
        } else {
            if (number % 2 == 1 || number % 2 == -1) {
                System.out.println(number + " is a " + positiveOrNegative + " odd number");
            } else {
                System.out.println(number + " is a " + positiveOrNegative + " non-odd number");
            }
        }
    }
}
