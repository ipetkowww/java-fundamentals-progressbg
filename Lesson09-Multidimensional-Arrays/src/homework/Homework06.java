package homework;

public class Homework06 {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {5, 8, 9},
                {4, 5, 3},
                {7, 6, 5},
                {9, 9, 9}
        };

        System.out.println("Input Matrix");
        printMatrix(matrix);

        int highestRow = getHighestRow(matrix);
        moveHighestRowAtTop(matrix, highestRow);

        System.out.println("Matrix after modification (highest row at top)");
        printMatrix(matrix);
    }

    static void moveHighestRowAtTop(int[][] matrix, int highestRow) {
        for (int j = 0; j < matrix[0].length; j++) {
            int temp = matrix[0][j];
            matrix[0][j] = matrix[highestRow][j];
            matrix[highestRow][j] = temp;
        }
    }

    static int getHighestRow(int[][] matrix) {
        int maxSum = 0;
        int bestRow = 0;

        for (int i = 0; i < matrix.length; i++) {
            int sumRow = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sumRow += matrix[i][j];
            }
            if (sumRow > maxSum) {
                maxSum = sumRow;
                bestRow = i;
            }
        }

        return bestRow;
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
