package additional_tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstArraySize;
        int secondArraySize;

        do {
            System.out.print("Enter number grater than 0 for size of the first array: ");
            firstArraySize = scanner.nextInt();
        } while (firstArraySize <= 0);

        do {
            System.out.print("Enter number grater than 0 for size of the second array: ");
            secondArraySize = scanner.nextInt();
        } while (secondArraySize <= 0);

        int[] firstArray = new int[firstArraySize];
        int[] secondArray = new int[secondArraySize];

        boolean isSameLength = firstArray.length == secondArray.length;
        boolean differentElement = false;
        int position = 0;

        if (isSameLength) {
            // fill first array with elements
            for (int i = 0; i < firstArray.length; i++) {
                System.out.print("Enter number for element " + (i + 1) + " for first array: ");
                firstArray[i] = scanner.nextInt();
            }
            // fill second array with elements
            for (int i = 0; i < secondArray.length; i++) {
                System.out.print("Enter number for element " + (i + 1) + " for second array: ");
                secondArray[i] = scanner.nextInt();
            }

            System.out.print("Both arrays have same length");
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] != secondArray[i]) {
                    differentElement = true;
                    position = i + 1;
                    break;
                }
            }
            if (differentElement) {
                System.out.println(" but different element at position " + position);
            } else {
                System.out.println(" and same elements");
            }

        } else {
            System.out.println("Different length of the arrays");
        }
    }
}
