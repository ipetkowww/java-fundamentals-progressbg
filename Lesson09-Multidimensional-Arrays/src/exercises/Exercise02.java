package exercises;

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] cities = new String[3][3];

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("Enter cities of country %d:%n", i + 1);
            for (int j = 0; j < cities[i].length; j++) {
                cities[i][j] = scanner.nextLine();
            }
        }

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("Cities of country %d: ", i + 1);
            for (int j = 0; j < cities[i].length; j++) {
                System.out.printf("%s ", cities[i][j]);
            }
            System.out.println();
        }

    }
}
