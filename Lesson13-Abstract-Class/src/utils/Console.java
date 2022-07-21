package utils;

import enums.IssueType;

import java.util.Scanner;

public class Console {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void greetingMessage() {
        System.out.println("============================================");
        System.out.println("==== HELLO IN OUR ISSUE TRACKING SYSTEM ====");
        System.out.println("============================================");
        System.out.println("Before proceeding, please provide following information");
        System.out.print("Please enter number for the issues you want to create: ");
    }

    public static void showMenuOptions() {
        System.out.println("Please select what do you want to do:");
        System.out.println("\t1- Create an issue");
//            System.out.println("\t2- List(Show) all issues"); // TODO
        System.out.println("\t3- Exit");
        System.out.print("Please enter your choice: ");
    }

    public static void showIssueMenuOptions() {
        System.out.println("What type of issue you want to create?");
        System.out.println("Please type one of the following options: ");
        System.out.println("\t - BUG");
        System.out.println("\t - TASK");
        System.out.println("\t - STORY");
    }

    public static void showExampleInputBasedOn(IssueType issueType) {
        switch (issueType) {
            case BUG, TASK -> System.out.println("Example: Name|Description|Priority|Assignee Name|Tester Name");
            case STORY ->
                    System.out.println("Example: Name|Description|Priority|AssigneeName1,AssigneeName2,etc|TesterName1,TesterName2,etc");
        }
    }

    public static int readNumberFromConsole() {
        return Integer.parseInt(SCANNER.nextLine());
    }

    public static String readTextFromConsole() {
        return SCANNER.nextLine();
    }

}
