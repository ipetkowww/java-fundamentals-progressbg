import java.util.Scanner;

public class Exercise02 {
//    Change the same program from the previous exercise to take in user input as an int,
//    and print all numbers from it to 0 (reversed).
//    Example:
//    Input: 7
//    Output:
//            7
//            6
//            5
//            4
//            3
//            2
//            1
//            0
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number different from 0 (zero): ");
            number = scanner.nextInt();
        } while (number == 0);

        if (number > 0) {
            // for positive numbers
            for (int i = number; i >= 0; i--) {
                System.out.println(i);
            }
        } else {
            // for negative numbers
            for (int i = number; i <= 0; i++) {
                System.out.println(i);
            }
        }
    }
}
