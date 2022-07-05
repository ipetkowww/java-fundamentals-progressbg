package homework;

import java.util.Random;
import java.util.Scanner;

public class Homework05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number for rows and columns of matrix: ");
        int n = scanner.nextInt();

        int[][] matrix = createMatrixWithRandomNumbers(n);

        int maxSum = 0;
        int bestColumn = 0;

        for (int i = 0; i < matrix.length; i++) {
            int sumColumn = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sumColumn += matrix[j][i];
            }
            if (sumColumn > maxSum) {
                maxSum = sumColumn;
                bestColumn = i;
            }
        }
        printMatrix(matrix);
        System.out.printf("Column %d has the largest sum of numbers: %d", bestColumn + 1, maxSum);
    }

    static void printMatrix(int[][] matrix) {
        for (int[] elements : matrix) {
            for (int element : elements) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    static int[][] createMatrixWithRandomNumbers(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = new Random().nextInt(n + 1);
            }
        }
        return matrix;
    }
}
