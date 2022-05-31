package exercises;

import java.util.Scanner;

public class Exercise04 {
//    Write a program that prints "Good evening" if the current time is bigger than 18, and "Good day" otherwise.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a time (whole number):");
        int time = scanner.nextInt();

        if (time > 18) {
            System.out.println("Good evening");
        } else {
            System.out.println("Good day");
        }
    }

}
