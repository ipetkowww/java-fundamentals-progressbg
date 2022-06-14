package exercise_in_class;

import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height;
        int width;
        // validation of height
        do {
            System.out.println("Enter height (number greater than 0):");
            height = scanner.nextInt();
        } while (height <= 0);
        // validation of width
        do {
            System.out.println("Enter width (number greater than 0):");
            width = scanner.nextInt();
        } while (width <= 0);

        // printing output
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }
}
