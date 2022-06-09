package exercise_in_class;

import java.util.Scanner;

public class Exercise02 {
//    Write a method that receives two integers and returns their sum. Print the returned value to the console.
    public static void main(String[] args) {
        int a = readNumberFromConsole();
        int b = readNumberFromConsole();

        int sum = sum(a, b);
        System.out.printf("%d + %d = %d", a, b, sum);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int readNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        return scanner.nextInt();
    }
}
