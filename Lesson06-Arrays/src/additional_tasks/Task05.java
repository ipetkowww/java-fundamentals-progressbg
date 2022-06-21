package additional_tasks;

public class Task05 {

    public static void main(String[] args) {
        int arraySize = 10;
        int[] array = createArray(arraySize);
        printElementOfArray(array);
    }

    static void printElementOfArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    static int[] createArray(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;
        }
        return array;
    }
}
