package homework10.student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name of the student: ");
        String name = scanner.next();
        System.out.print("Enter age of the student: ");
        int age = scanner.nextInt();

        Student student = new Student(name, age);
        System.out.println(student);
    }
}
