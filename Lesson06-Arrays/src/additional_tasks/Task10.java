package additional_tasks;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersCount = 7;
        int[] array = new int[numbersCount];

        System.out.println("Please enter " + numbersCount + " numbers");
        for (int i = 0; i < numbersCount; i++) {
            System.out.print("Enter number for element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        average /= array.length;

        int maxDiff = array[0];
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            int diff = average - array[i];
            if (diff < 0) {
                diff *= -1;
            }
            if (diff < maxDiff) {
                maxDiff = diff;
                position = i;
            }
        }

        System.out.println("Average value is " + average + ", closest value is " + array[position]);
    }
}
