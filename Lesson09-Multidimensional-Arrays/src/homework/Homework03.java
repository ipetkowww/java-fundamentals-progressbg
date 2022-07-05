package homework;

public class Homework03 {

    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30},
                {40, 50, 60}
        };

        int[][] result = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        printMatrix(result);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] elements : matrix) {
            for (int element : elements) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}
