package exercise_in_class;

import java.util.Scanner;

public class Exercise01 {
//    Write a program to receives any input by the user using Scanner's nextLine() method and print it.
//    Print all the commands until a command called "exit" is received. When this command is received, terminate the loop.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equalsIgnoreCase("exit")) {
            System.out.println(input);
            input = scanner.nextLine();
        }
    }
}
