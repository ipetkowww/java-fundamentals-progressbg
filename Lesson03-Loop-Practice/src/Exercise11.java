import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        int n = inputNumber;
        int checkNumber = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            checkNumber = checkNumber * 10 + lastDigit;
            n /= 10;
        }

        String result = checkNumber == inputNumber ? " is a palindrome" : " is not a palindrome";
        System.out.println(inputNumber + result);
    }
}
