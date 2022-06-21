package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        int sizeOfArray = getSizeOfArray();
        int[] array = createArrayWithElements(sizeOfArray);
        int lowestNumberDivisibleBy3 = getLowestNumberDivisibleBy3(array);
        System.out.println("Input array is " + Arrays.toString(array));
        System.out.println("Lowest number divisible by 3 is " + lowestNumberDivisibleBy3);
    }

    static int readNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static int getSizeOfArray() {
        int size;
        do {
            System.out.print("Enter a positive number grater than 0 (zero) for the size of the array: ");
            size = readNumberFromConsole();
        } while (size <= 0);

        return size;
    }

    static int[] createArrayWithElements(int arraySize) {
        int[] result = new int[arraySize];
        for (int i = 0; i < result.length; i++) {
            System.out.print("Enter number for position " + (i + 1) + "in the array: ");
            result[i] = readNumberFromConsole();
        }
        return result;
    }

    static int getLowestNumberDivisibleBy3(int[] array) {
        int minElement = array[0];
        for (int element : array) {
            if (element % 3 == 0 && element < minElement) {
                minElement = element;
            }
        }
        return minElement;
    }
}
