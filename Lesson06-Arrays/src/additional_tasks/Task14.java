package additional_tasks;

import java.util.Scanner;

public class Task14 {

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

        double[] newArray = new double[sizeOfArray];
        int index = 0;
        int validNumbersCount = 0;

        for (int i = 0; i < array.length; i++) {
            double currentElement = array[i];
            if (currentElement >= -2.99 && currentElement <= 2.99) {
                newArray[index] = currentElement;
                index++;
                validNumbersCount++;
            }
        }

        for (int i = 0; i < validNumbersCount; i++) {
            System.out.print(newArray[i]);
            if (i < validNumbersCount - 1) {
                System.out.print("; ");
            }
        }
    }
}
