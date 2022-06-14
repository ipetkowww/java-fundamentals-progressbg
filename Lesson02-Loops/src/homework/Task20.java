package homework;

public class Task20 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int number = i;
            for (int j = 1; j <= 10; j++) {
                if (number % 10 == 0) {
                    number = 0;
                }
                System.out.print(number++ + " ");
            }

            System.out.println();
        }
    }
}
