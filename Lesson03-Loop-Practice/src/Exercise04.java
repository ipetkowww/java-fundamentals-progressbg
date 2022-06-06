import java.util.Scanner;

public class Exercise04 {
//    Write a program that prompts user to enter two integers.
//    The program shall read the two integers as int; compute their sum; and print the result.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int secondNumber = scanner.nextInt();

        System.out.println("The sum is: " + (firstNumber + secondNumber));
    }
}
