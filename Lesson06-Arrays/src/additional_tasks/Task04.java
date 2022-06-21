package additional_tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        int sizeOfArray = getSizeOfArray();
        int[] array = createArrayWithElements(sizeOfArray);

        boolean isMirrored = isMirrored(array);

        System.out.print("Array ");
        printElementOfArray(array);
        System.out.println(isMirrored ? " is mirrored" : " is not mirrored");
    }

    private static void printElementOfArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    private static boolean isMirrored(int[] array) {
        boolean isMirrored = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                isMirrored = false;
                break;
            }
        }
        return isMirrored;
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
            System.out.print("Enter number for position " + (i + 1) + " in the array: ");
            result[i] = readNumberFromConsole();
        }
        return result;
    }

    static int readNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
