import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= base;
        }

        System.out.printf("%d power %d is %d", base, power, result);
    }
}
