package homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
//    Write your own calculator that has plus, minus, multiply and divide functions.
//    Receive two integers: a and b
//    Receive a String command called plus, minus, multiply or divide.
//    When receiving the command, call the necessary method and print the result in the form of: "Result of %commandName" between numbers %a% and %b% is %intResult"

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isTurnOn = true;

        while (isTurnOn) {
            printCalculatorMenu();
            String userChoice;
            boolean isValidOperation;

            do {
                System.out.print("Please enter your option [ +, -, *, /, ! ]: ");
                userChoice = scanner.nextLine();
                isValidOperation = isValidOperation(userChoice);
                if (!isValidOperation) {
                    System.out.println("Invalid operation. Please try again");
                }
            } while (!isValidOperation);

            if (userChoice.equals("!")) {
                System.out.println("Closing calculator...");
                System.out.println("Bye bye");
                isTurnOn = false;
            } else {
                System.out.println("Please enter two numbers: ");
                System.out.print("Enter first number: ");
                int firstNumber = scanner.nextInt();
                System.out.print("Enter second number: ");
                int secondNumber = scanner.nextInt();
                scanner.nextLine();

                double result = getResultFromOperation(userChoice, firstNumber, secondNumber);
                DecimalFormat df = new DecimalFormat("0.##");
                System.out.printf("Result of %s between numbers %d and %d is %s%n%n", getNameOperation(userChoice), firstNumber, secondNumber, df.format(result));
            }
        }
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double divide(int a, int b) {
        return a / (b * 1.0);
    }

    static void printCalculatorMenu() {
        System.out.println("Calculator Menu:");
        System.out.println("Select:");
        System.out.println("+ for [sum] operation");
        System.out.println("- for [subtract] operation");
        System.out.println("* for [multiply] operation");
        System.out.println("/ for [divide] operation");
        System.out.println("! for [exit] the program");
    }

    static boolean isValidOperation(String operation) {
        char c = operation.charAt(0);
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '!') && operation.length() == 1;
    }

    static double getResultFromOperation(String operation, int a, int b) {
        switch (operation) {
            case "+":
                return sum(a, b);
            case "-":
                return subtract(a, b);
            case "*":
                return multiply(a, b);
            case "/":
                return divide(a, b);
        }
        return 0;
    }

    static String getNameOperation(String operation) {
        switch (operation) {
            case "+":
                return "plus";
            case "-":
                return "minus";
            case "*":
                return "multiply";
            case "/":
                return "divide";
        }
        return "";
    }
}
