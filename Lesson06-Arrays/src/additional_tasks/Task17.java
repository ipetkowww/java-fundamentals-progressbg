package additional_tasks;

import java.util.Scanner;

public class Task17 {

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
        // first entered element will be the last in the array and so on
        int elementCount = 1;
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print("Enter number for element " + (elementCount++) + " in the array: ");
            array[i] = scanner.nextInt();
        }

        boolean isZigZag = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (i % 2 == 0) {
                if (array[i] >= array[i + 1]) {
                    isZigZag = false;
                    break;
                }
            } else {
                if (array[i] <= array[i + 1]) {
                    isZigZag = false;
                    break;
                }
            }
        }

        System.out.print("Array: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("] is zig zag = " + isZigZag);
    }
}
