package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = readNumberFromConsole(scanner);
        int[] array = new int[sizeArray];
        fillArrayWithData(array, scanner);

        int maxElement = findMaxElementInArray(array);
        int minElement = findMinElementInArray(array);

        System.out.printf("Input array: %s. Max element is %d. Min element is %d%n",
                Arrays.toString(array), maxElement, minElement);
    }

    static int readNumberFromConsole(Scanner scanner) {
        int size;
        do {
            System.out.print("Enter size of the array (positive number grater than 0): ");
            size = scanner.nextInt();
        } while (size <= 0);

        return size;
    }

    static void fillArrayWithData(int[] array, Scanner scanner) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter number for index " + i + ": ");
            array[i] = scanner.nextInt();
        }
    }

    static int findMaxElementInArray(int[] array) {
        int maxElement = array[0];
        for (int element : array) {
            if (element > maxElement) {
                maxElement = element;
            }
        }
        return maxElement;
    }

    static int findMinElementInArray(int[] array) {
        int minElement = array[0];
        for (int element : array) {
            if (element < minElement) {
                minElement = element;
            }
        }
        return minElement;
    }
}
