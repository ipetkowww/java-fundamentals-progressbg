import java.util.Scanner;

public class Exercise07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter any positive integer: ");
            number = scanner.nextInt();
        } while (number <= 0);

        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.printf("Factorial of %d is %d", number, factorial);
    }
}
