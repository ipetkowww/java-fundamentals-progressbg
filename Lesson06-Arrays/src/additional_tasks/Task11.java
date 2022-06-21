package additional_tasks;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersCount = 7;
        int[] array = new int[numbersCount];

        System.out.println("Please enter " + numbersCount + " numbers");
        for (int i = 0; i < numbersCount; i++) {
            System.out.print("Enter number for element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int currentElement = array[i];
            if (currentElement % 5 == 0 && currentElement > 5) {
                System.out.print(currentElement + " ");
                count++;
            }
        }
        System.out.print("- " + count + " number/s");
    }
}
