package homework05;

import person.Person;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number for count of persons: ");
        int studentsCount = scanner.nextInt();

        Person[] persons = new Person[studentsCount];

        for (int i = 0; i < persons.length; i++) {
            int studentNumber = i + 1;
            System.out.print("Enter name for Person " + studentNumber + ": ");
            String name = readTextFromConsole(scanner);

            System.out.print("Enter age for Person " + studentNumber + ": ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Is person " + studentNumber + " a student? [type yes or no]: ");
            String answer = readTextFromConsole(scanner);
            boolean isStudent = answer.equalsIgnoreCase("yes");

            persons[i] = new Person(name, age, isStudent);
        }

        printInfoForStudentsOnly(persons);
    }

    static void printInfoForStudentsOnly(Person[] persons) {
        for (Person person : persons) {
            if (person.isStudent) {
                person.printPersonalInfo();
            }
        }
    }

    static String readTextFromConsole(Scanner scanner) {
        String text = scanner.next();
        scanner.nextLine();
        return text;
    }
}
