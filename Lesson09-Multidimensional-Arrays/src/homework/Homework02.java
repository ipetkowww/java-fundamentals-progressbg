package homework;

import java.util.Random;
import java.util.Scanner;

public class Homework02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number for rows and columns of matrix: ");
        int n = scanner.nextInt();

        printMatrix(n);
    }

    static void printMatrix(int n) {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = new Random().nextInt(30);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }


}
