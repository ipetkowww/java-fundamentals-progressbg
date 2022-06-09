package homework;

import java.util.Scanner;

public class Task02 {

    // Question 2 from http://www.beginwithjava.com/java/methods/questions.html
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isEven = isEven(number);
        System.out.println(isEven ? "Number is even" : "Number is not even");
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
