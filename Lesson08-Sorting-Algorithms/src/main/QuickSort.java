package main;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {8, 9, 4, 2, 6, 5, 3, 10, 1, 7};

        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }


    static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }

    static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int nextIndex = start + 1;

        for (int i = start; i <= end; i++) {
            if (arr[i] < pivot) {
                int temp = arr[nextIndex];
                arr[nextIndex] = arr[i];
                arr[i] = temp;
                nextIndex++;
            }
        }

        int temp = arr[start];
        arr[start] = arr[nextIndex - 1];
        arr[nextIndex - 1] = temp;
        return nextIndex - 1;
    }

}
