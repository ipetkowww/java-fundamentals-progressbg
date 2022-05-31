package homework;

import java.util.Scanner;

public class Task05 {
    //Write a program that receives a single int
//        Check if the int is between 10 exclusive and 1000 exclusive
//        If yes, print "true"
//        If no, print "false"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number:");
        int number = scanner.nextInt();

        System.out.println(number > 10 && number < 1000);
    }

}
