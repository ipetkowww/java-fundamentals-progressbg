package homework;

import java.util.Scanner;

public class Task05 {

    // Question 5 from http://www.beginwithjava.com/java/methods/questions.html
    public static void main(String[] args) {
        int number = readNumberFromConsole();
        boolean palindrome = isPalindrome(number);
        System.out.println(palindrome ? "Number is palindrome" : "Number is not palindrome");
    }

    static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }
        int originalNumber = number;
        int newNumber = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            newNumber = newNumber * 10 + lastDigit;
            number /= 10;
        }
        return originalNumber == newNumber;
    }

    static int readNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        return scanner.nextInt();
    }

}
