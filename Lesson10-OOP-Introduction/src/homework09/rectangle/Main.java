package homework09.rectangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number for length of rectangle: ");
        int length = scanner.nextInt();

        System.out.print("Enter number for width of rectangle: ");
        int width = scanner.nextInt();

        Rectangle rectangle = new Rectangle(length, width);
        int area = rectangle.getArea();

        System.out.println("The area of rectangle is " + area);
    }

}
