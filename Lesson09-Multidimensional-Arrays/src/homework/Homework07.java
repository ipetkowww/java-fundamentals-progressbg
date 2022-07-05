package homework;

public class Homework07 {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {5, 8, 9},
                {4, 2, 3}
        };


        System.out.println("Input matrix");
        printMatrix(matrix);

        int highestColumn = getHighestColumn(matrix);
        putHighestColumnInBeginning(matrix, highestColumn);

        System.out.println("Matrix after modification (highest row in the beginning");
        printMatrix(matrix);

    }

    static void putHighestColumnInBeginning(int[][] matrix, int highestColumn) {
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][0];
            matrix[i][0] = matrix[i][highestColumn];
            matrix[i][highestColumn] = temp;
        }
    }

    static int getHighestColumn(int[][] matrix) {
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
        return bestColumn;
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
