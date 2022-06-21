package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = readNumberFromConsole(scanner);
        int[] array = new int[sizeArray];
        fillArrayWithData(array, scanner);

        System.out.print("Enter a number you want to check whether exist in array: ");
        int numberForCheck = scanner.nextInt();

        boolean numberExistInArray = isNumberExistInArray(numberForCheck, array);

        System.out.printf("Input array: %s. Number %d ", Arrays.toString(array), numberForCheck);

        if (numberExistInArray) {
            System.out.print("exists in array");
        } else {
            System.out.println("does not exist in array");
        }
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

    static boolean isNumberExistInArray(int number, int[] array) {
        boolean isExist = false;

        for (int element : array) {
            if (element == number) {
                isExist = true;
                break;
            }
        }
        return isExist;
    }
}
