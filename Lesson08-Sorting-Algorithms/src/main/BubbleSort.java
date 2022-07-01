package main;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {3, 6, 1, 5, 8, 4};

        bubbleSortAscending(array);
        System.out.println("Ascending order: " + Arrays.toString(array));

        bubbleSortDescending(array);
        System.out.println("Descending order: " + Arrays.toString(array));
    }

    static void bubbleSortAscending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean sorted = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
         }
    }

    static void bubbleSortDescending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean sorted = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
    }
}
