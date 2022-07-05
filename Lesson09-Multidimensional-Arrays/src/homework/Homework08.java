package homework;

import java.util.Scanner;

public class Homework08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int rows = scanner.nextInt();

        int[][] matrix = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.println("Enter size of row " + i);
            int currentRowSize = scanner.nextInt();
            matrix[i] = new int[currentRowSize];

            System.out.println("Enter " + currentRowSize + " numbers for row " + i);
            for (int j = 0; j < currentRowSize; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        printMatrix(matrix);
    }

    static void printMatrix(int[][] matrix) {
        for (int[] elements : matrix) {
            for (int element : elements) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}
