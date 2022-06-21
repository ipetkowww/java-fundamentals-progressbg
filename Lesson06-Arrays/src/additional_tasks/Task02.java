package additional_tasks;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        int sizeOfArray = getSizeOfArray();
        int[] array = createArrayWithElements(sizeOfArray);
        int[] newArray = new int[array.length * 2];

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            newArray[counter++] = array[i];
        }
        for (int i = array.length - 1; i >= 0; i--) {
            newArray[counter++] = array[i];
        }

        printElementOfArray(newArray);

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
