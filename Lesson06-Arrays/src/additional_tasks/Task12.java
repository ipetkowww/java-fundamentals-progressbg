package additional_tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersCount = 7;
        int[] array = new int[numbersCount];

        System.out.println("Please enter " + numbersCount + " numbers");
        for (int i = 0; i < numbersCount; i++) {
            System.out.print("Enter number for element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // replace values of first and second element using third variable
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;

        // replace values of third and fourth element using sum operation
        array[2] = array[2] + array[3];
        array[3] = array[2] - array[3];
        array[2] = array[2] - array[3];

        // replace values of fifth and sixth element using multiplication operation
        array[4] = array[4] * array[5];
        array[5] = array[4] / array[5];
        array[4] = array[4] / array[5];

        // print modified array
        System.out.print("Modified array: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
