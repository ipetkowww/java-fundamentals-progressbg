package exercises;

import java.util.Scanner;

public class Exercise05 {
//    Write a program to:
//            Print "Good morning" if the current time is below 10.
//            Else, if the time is below 20, it should print "Good day"
//            Finally, it should print "Good evening" if none of the previous conditions were met.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a time (whole number)");
        int time = scanner.nextInt();

        if (time < 10) {
            System.out.println("Good morning");
        } else if (time < 20) {
            System.out.println("Good day");
        } else {
            System.out.println("Good evening");
        }
    }
}
