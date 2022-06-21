package additional_tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        // scanner for reading from the console
        Scanner scanner = new Scanner(System.in);

        // reading number while entered number is grater than 0 and assign that value to the size of array
        int sizeOfArray;
        do {
            System.out.print("Enter number greater than 0: ");
            sizeOfArray = scanner.nextInt();
        } while (sizeOfArray <= 0);

        // initializing the array with the given size
        int[] array = new int[sizeOfArray];

        // fill the array with data entered from the console
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter number for element " + (i + 1) + " in the array: ");
            array[i] = scanner.nextInt();
        }

        int longestCount = 1;
        int longestElement = array[0];
        int maxLong = 1;

        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            int previousElement = array[i - 1];
            if (currentElement == previousElement) {
                longestCount++;
                if (longestCount > maxLong) {
                    maxLong = longestCount;
                    longestElement = currentElement;
                }
            } else {
                longestCount = 1;
            }
        }

        // print array
        System.out.print("Array is: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // print longest count if exist
        if (longestCount == 1) {
            System.out.print("No longest count in the array.");
        } else {
            System.out.print("Longest count is " + maxLong + " with sequence of: ");
            for (int i = 0; i < maxLong; i++) {
                System.out.print(longestElement + " ");
            }
        }
    }
}
