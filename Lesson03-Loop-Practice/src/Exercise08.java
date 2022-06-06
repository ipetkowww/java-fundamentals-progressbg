import java.util.Scanner;

public class Exercise08 {
//Write a program that prompts user for the mark (between 0-100 in int) of 3 students;
// computes the average (in double); and prints the result rounded to 2 decimal places.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsCount = 3;
        double sumOfMarks = 0;
        double mark = 0;

        for (int i = 0; i < studentsCount; i++) {
            boolean validMark;
            // validation of user input for mark
            do {
                System.out.print("Enter the mark (0-100) for student " + (i + 1) + ": ");
                mark = scanner.nextDouble();
                validMark = mark > 0 && mark < 100;
                if (!validMark) {
                    System.out.println("Invalid input, try again...");
                }
            } while (!validMark);

            sumOfMarks += mark;
        }
        System.out.printf("The average is: %.2f", sumOfMarks / studentsCount);
    }
}
