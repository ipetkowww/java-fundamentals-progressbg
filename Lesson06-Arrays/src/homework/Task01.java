package homework;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = readNumberFromConsole(scanner);
        int[] array = new int[sizeArray];
        int sumOfElements = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter number for index " + i + ": ");
            array[i] = scanner.nextInt();
            sumOfElements += array[i];
        }

        double average = sumOfElements * 1.0 / array.length;
        System.out.print("Average value of the array elements ");
        printElementsOfArray(array);
        System.out.print(" is " + average);
    }

    static int readNumberFromConsole(Scanner scanner) {
        int size;
        do {
            System.out.print("Enter size of the array (positive number grater than 0): ");
            size = scanner.nextInt();
        } while (size <= 0);

        return size;
    }

    static void printElementsOfArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

}
