package homework;

import java.util.Scanner;

public class Task10 {

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
        int[] originalArray = new int[sizeOfArray];

        // fill the array with data entered from the console
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print("Enter number for element " + (i + 1) + " in the array: ");
            originalArray[i] = scanner.nextInt();
        }

        // initializing a new array with size as the original array
        int[] newArray = new int[originalArray.length];

        // fill the new array with numbers following the rules:
        // the value of each element of the new array should be equal
        // to the sum of previous and next element in original array
        // first and last element of new array should be equal to the first and last element of original array
        newArray[0] = originalArray[0];
        newArray[newArray.length - 1] = originalArray[originalArray.length - 1];

        for (int i = 1; i < originalArray.length - 1; i++) {
            newArray[i] = originalArray[i - 1] + originalArray[i + 1];
        }

        // print values of new array
        System.out.print("[");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
            if (i < newArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
