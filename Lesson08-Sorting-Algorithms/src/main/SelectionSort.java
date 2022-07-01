package main;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {35, 26, 25, 2, 28, 46, 37, 30, 47, 41, 45, 22, 48};

        System.out.println("== Selection Sort ==");

        selectionSortAscending(array);
        System.out.println("Ascending order: " + Arrays.toString(array));

        selectionSortDescending(array);
        System.out.println("Descending order: " + Arrays.toString(array));
    }

    static void selectionSortDescending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            swap(array, i, maxIndex);
        }
    }

    static void selectionSortAscending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, minIndex, i);
        }
    }

    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
