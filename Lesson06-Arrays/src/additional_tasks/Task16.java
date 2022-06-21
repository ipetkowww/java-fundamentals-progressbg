package additional_tasks;

import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {
        // scanner for reading from the console
        Scanner scanner = new Scanner(System.in);

        // reading number while entered number is grater than 0 and assign that value to the size of array
        int sizeOfArray = 10;

        // initializing the array with the given size
        double[] originalArr = new double[sizeOfArray];

        // fill the array with data entered from the console
        System.out.println("Enter " + sizeOfArray + " numbers");
        for (int i = 0; i < originalArr.length; i++) {
            System.out.print("Enter number for element " + (i + 1) + " in the array: ");
            originalArr[i] = scanner.nextDouble();
        }

        double[] newArr = new double[sizeOfArray];

        System.out.print("Original array: [");
        for (int i = 0; i < originalArr.length; i++) {
            double currentElement = originalArr[i];
            double position = i + 1;
            if (currentElement < -0.231) {
                newArr[i] = (position * position) + 41.25;
            } else {
                newArr[i] = currentElement * position;
            }
            System.out.print(originalArr[i]);
            if (i < originalArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // print new array
        System.out.print("Original array: [");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]);
            if (i < newArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
