package exercises;

import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] cities = new String[3][4];

        for (int i = 0; i < cities.length; i++) {
            System.out.print("Enter a country: ");
            String country = scanner.nextLine();
            cities[i][0] = country;

            System.out.printf("Enter cities of country %s:%n", country);
            for (int j = 1; j < cities[i].length; j++) {
                cities[i][j] = scanner.nextLine();
            }
        }

        for (String[] city : cities) {
            System.out.printf("Cities of country %s: ", city[0]);
            for (int j = 1; j < city.length; j++) {
                System.out.printf("%s ", city[j]);
            }
            System.out.println();
        }

    }
}
