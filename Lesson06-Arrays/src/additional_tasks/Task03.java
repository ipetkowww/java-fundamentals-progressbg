package additional_tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int number = readNumberFromConsole();

        int[] array = new int[10];
        array[0] = number;
        array[1] = number;

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        printElementOfArray(array);
    }

    static void printElementOfArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    static int readNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
