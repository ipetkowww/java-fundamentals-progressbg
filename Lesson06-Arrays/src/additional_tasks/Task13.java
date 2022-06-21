package additional_tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[32];
        int number;

        do {
            System.out.print("Enter a positive number grater than 0: ");
            number = scanner.nextInt();
        } while (number <= 0);

        int index = 0;
        int counter = 0;

        while (number > 0) {
            int remainder = number % 2;
            array[index] = remainder;
            number /= 2;
            index++;
            counter++;
        }

        for (int i = counter - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }
}
