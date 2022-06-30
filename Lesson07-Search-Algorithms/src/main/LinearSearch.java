package main;

public class LinearSearch {

    public static void main(String[] args) {
        int[] array = {1, 10, 23, 115, 99, 5, 9, 2, 732, 25, 31};

        printResultLinearSearch(array, 23);
        printResultLinearSearch(array, 25);
        printResultLinearSearch(array, 32);
        printResultLinearSearch(array, 9);
    }

    static int linearSearch(int[] array, int searchValue) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                index = i;
                break;
            }
        }
        return index;
    }

    static void printResultLinearSearch(int[] array, int searchValue) {
        int foundIndex = linearSearch(array, searchValue);
        if (foundIndex >= 0) {
            System.out.printf("Element %d found at index %d.%n", searchValue, foundIndex);
        } else {
            System.out.printf("Element %d not found.%n", searchValue);
        }
    }
}
