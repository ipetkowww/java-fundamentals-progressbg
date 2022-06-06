import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number in range [1..100]: ");
        int number = scanner.nextInt();

        if (number > 100) {
            System.out.println("Number must be less or equal to 100");
        } else {
            for (int i = number; i >= 0; i--) {
                System.out.println(number);
            }
        }
    }
}
