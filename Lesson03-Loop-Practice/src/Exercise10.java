import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a whole positive number grater than 0 (zero): ");
            number = scanner.nextInt();
        } while (number <= 0);

        double result = 0;

        for (int i = 2; i <= number; i++) {
            result += 1.0 / i;
        }

        System.out.println("Result is " + result);
    }
}
