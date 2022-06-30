package main;

public class BinarySearchRecursively {

    public static void main(String[] args) {
        int[] array = {22, 27, 39, 44, 46, 51, 53, 59, 62, 93, 98};

        printResultBinarySearchRecursively(array, 93);
        printResultBinarySearchRecursively(array, 46);
        printResultBinarySearchRecursively(array, 111);
        printResultBinarySearchRecursively(array, 59);
        printResultBinarySearchRecursively(array, 200);
    }


    static int binarySearchRecursively(int[] array, int searchValue, int first, int last) {

        if (first <= last) {
            int middle = (first + last) / 2;

            if (array[middle] < searchValue) {
                return binarySearchRecursively(array, searchValue, middle + 1, last);
            }
            if (array[middle] > searchValue) {
                return binarySearchRecursively(array, searchValue, first, middle - 1);
            }

            return middle;
        }

        return -1;
    }

    static void printResultBinarySearchRecursively(int[] array, int searchValue) {
        int foundIndex = binarySearchRecursively(array, searchValue, 0, array.length - 1);
        if (foundIndex >= 0) {
            System.out.println("Element " + searchValue + " is found at index " + foundIndex + "");
        } else {
            System.out.println("Element " + searchValue + " not found");
        }
    }
}
