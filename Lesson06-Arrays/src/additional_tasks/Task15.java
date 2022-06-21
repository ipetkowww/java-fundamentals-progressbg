package additional_tasks;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        // scanner for reading from the console
        Scanner scanner = new Scanner(System.in);

        // reading number while entered number is grater than 0 and assign that value to the size of array
        int sizeOfArray;
        do {
            System.out.print("Enter whole number greater than 0: ");
            sizeOfArray = scanner.nextInt();
        } while (sizeOfArray <= 0);

        // initializing the array with the given size
        double[] array = new double[sizeOfArray];

        // fill the array with data entered from the console
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter number for element " + (i + 1) + " in the array: ");
            array[i] = scanner.nextDouble();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    double temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        int topThreeBiggestNumber = 3;
        for(int i = topThreeBiggestNumber - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print("; ");
            }
        }
    }
}
