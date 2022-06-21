package additional_tasks;

import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstArrSize;
        int secondArrSize;

        do {
            System.out.print("Enter whole number grater than 0: ");
            firstArrSize = scanner.nextInt();
        } while (firstArrSize <= 0);

        do {
            System.out.print("Enter whole number grater than 0: ");
            secondArrSize = scanner.nextInt();
        } while (secondArrSize <= 0);

        int[] firstArr = new int[firstArrSize];
        int[] secondArr = new int[secondArrSize];
        int[] longestArray;

        System.out.println("-Entering " + firstArrSize + " values for first array-");
        for (int i = 0; i < firstArr.length; i++) {
            System.out.print("Enter a number: ");
            firstArr[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.println("-Entering " + secondArrSize + " values for second array-");
        for (int i = 0; i < secondArr.length; i++) {
            System.out.print("Enter a number: ");
            secondArr[i] = scanner.nextInt();
        }


        // determine longest array
        if (firstArr.length != secondArr.length) {
            longestArray = firstArr.length > secondArr.length ? firstArr : secondArr;
        } else {
            longestArray = firstArr;
        }
        int[] result = new int[longestArray.length];


        for (int i = 0; i < longestArray.length; i++) {
            if (i < longestArray.length - 1) {
                result[i] = firstArr[i] > secondArr[i] ? firstArr[i] : secondArr[i];
            } else {
                result[i] = longestArray[i];
            }
        }
        System.out.println();

        System.out.print("first arr = ");
        printElementOfArray(firstArr);

        System.out.print("second arr = ");
        printElementOfArray(secondArr);

        System.out.print("result arr = ");
        printElementOfArray(result);
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
        System.out.println();
    }
}
