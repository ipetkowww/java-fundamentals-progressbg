package homework;

import java.util.Scanner;

public class Task07 {
    //Write a program called that prompts user for three integers.
//The program shall read the inputs as int;
// compute the sum, product, minimum and maximum of the three integers; and print the results.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int firstInt = scanner.nextInt();
        System.out.print("Enter 2nd integer: ");
        int secondInt = scanner.nextInt();
        System.out.print("Enter 3rd integer: ");
        int thirdInt = scanner.nextInt();

        int min = firstInt < secondInt ? firstInt : secondInt;
        min = min < thirdInt ? min : thirdInt;

        int max = firstInt > secondInt ? firstInt : secondInt;
        max = max > thirdInt ? max : thirdInt;

        System.out.println("The sum is: " + (firstInt + secondInt + thirdInt));
        System.out.println("The product is: " + (firstInt * secondInt * thirdInt));
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);
    }

}
