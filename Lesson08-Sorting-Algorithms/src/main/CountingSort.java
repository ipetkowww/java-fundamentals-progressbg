package main;

import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {

        int[] arr = {2, 6, 3, 4, 9, 10, 1, 1, 5, 7, 7, 2, 10, 2, 1, -1};
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void countingSort(int[] arr) {
        int min = findMinElement(arr);
        int max = findMaxElement(arr);
        int[] counters = new int[max - min + 1];

        for (int element : arr) {
            counters[element - min]++;
        }
        sort(arr, counters, min);
    }

    static int findMinElement(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int findMaxElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void sort(int[] arr, int[] counters, int minValue) {
        int index = 0;
        for (int i = 0; i < counters.length; i++) {
            int counter = counters[i];
            for (int j = 0; j < counter; j++) {
                arr[index++] = i + minValue;
            }
        }
    }
}
