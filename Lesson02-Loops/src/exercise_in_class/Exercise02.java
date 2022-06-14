package exercise_in_class;

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            input = scanner.nextLine();
            System.out.println(input);
        } while (!input.equalsIgnoreCase("exit"));
    }
}
