package homework;

import java.util.Scanner;

public class Task23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = 1;
        int secondNum = 1;

        while (firstNum < 10) {
            while (secondNum < 10) {
                System.out.print(firstNum + "*" + secondNum + "; ");
                secondNum++;
            }
            System.out.println();
            firstNum++;
            secondNum = firstNum;
        }
    }
}
