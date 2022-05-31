package homework;

import java.util.Scanner;

public class Task06 {
    //Write a program that receives a single int
//        Check if the int is between 3 inclusive or 33 inclusive
//        If yes, print "true"
//        If no, print "false"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number >= 3 && number <= 33);
    }

}
