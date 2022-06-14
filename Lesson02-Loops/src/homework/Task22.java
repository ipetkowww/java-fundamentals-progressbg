package homework;

import java.util.Scanner;

public class Task22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter number in range [1..999]:");
            number = scanner.nextInt();
        } while (number < 1 || number > 999);

        int numbersCount = 0;
        int startNumber = number + 1;


        while (numbersCount < 10) {
            if ((startNumber % 2 == 0 || startNumber % 3 == 0 || startNumber % 5 == 0)) {
                numbersCount++;
                System.out.print(numbersCount + ":" + startNumber + ", ");
                if (numbersCount == 10) {
                    System.out.print(numbersCount + ":" + startNumber);
                }
            }
            startNumber++;
        }
    }
}
