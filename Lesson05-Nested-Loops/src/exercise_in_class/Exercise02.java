package exercise_in_class;

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {
        System.out.print("Enter number for rows: ");
        int rows = readNumberFromConsole();
        int spaces = rows;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            spaces--;
        }
    }

    static int readNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
