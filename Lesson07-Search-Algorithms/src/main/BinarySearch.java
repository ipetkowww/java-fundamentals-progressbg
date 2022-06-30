package main;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {22, 27, 39, 44, 46, 51, 53, 59, 62, 93, 98};

        printResultBinarySearch(array, 22);
        printResultBinarySearch(array, 98);
        printResultBinarySearch(array, 51);
        printResultBinarySearch(array, 100);
        printResultBinarySearch(array, 27);
    }

    static int binarySearch(int[] array, int searchValue) {
        int firstPosition = 0;
        int middlePosition = array.length / 2;
        int lastPosition = array.length - 1;
        int foundIndex = -1;

        while (firstPosition <= lastPosition) {
            if (array[middlePosition] < searchValue) {
                firstPosition = middlePosition + 1;
            } else if (array[middlePosition] > searchValue) {
                lastPosition = middlePosition - 1;
            } else {
                foundIndex = middlePosition;
                break;
            }
            middlePosition = (firstPosition + lastPosition) / 2;
        }
        return foundIndex;
    }

    static void printResultBinarySearch(int[] array, int searchValue) {
        int foundIndex = binarySearch(array, searchValue);
        if (foundIndex >= 0) {
            System.out.println("Element " + searchValue + " is found at index " + foundIndex + "");
        } else {
            System.out.println("Element " + searchValue + " not found");
        }
    }

}
