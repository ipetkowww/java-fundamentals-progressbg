package homework;

import java.util.Scanner;

public class Homework01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows of matrix: ");
        int rows = scanner.nextInt();
        System.out.print("Input number of columns of matrix: ");
        int columns = scanner.nextInt();

        int[][] firstMatrix = createMatrix(rows, columns);
        int[][] secondMatrix = createMatrix(rows, columns);

        System.out.println("Input elements of first matrix:");
        fillMatrixWithData(firstMatrix, scanner);

        System.out.println("Input elements of second matrix:");
        fillMatrixWithData(secondMatrix, scanner);

        int[][] result = sumTwoMatrices(firstMatrix, secondMatrix);
        printMatrix(result);
    }

    static void printMatrix(int[][] matrix) {
        for (int[] elements : matrix) {
            for (int element : elements) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    static int[][] sumTwoMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int[][] result = new int[firstMatrix.length][firstMatrix[0].length];
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                result[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        return result;
    }

    static void fillMatrixWithData(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    static int[][] createMatrix(int rows, int columns) {
        return new int[rows][columns];
    }


}
