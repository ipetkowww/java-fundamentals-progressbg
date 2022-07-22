package utils;

import enums.IssueType;
import models.issues.Issue;

import java.util.Scanner;

public class Console {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void greetingMessage() {
        System.out.println("============================================");
        System.out.println("==== HELLO IN OUR ISSUE TRACKING SYSTEM ====");
        System.out.println("============================================");
        System.out.println("Before proceeding, please provide following information");
        System.out.print("Please enter number for the issues you want to create (number grater than 0): ");
    }

    public static void showMenuOptions() {
        System.out.println("Please select what do you want to do:");
        System.out.println("\t1 - Create an issue");
        System.out.println("\t2 - Show issues");
        System.out.println("\t3 - Exit");
        System.out.print("Please enter your choice: ");
    }

    public static void showIssueMenuForCreate() {
        System.out.println("What type of issue you want to create?");
        showAllIssueTypes();
    }

    public static void showIssueMenuForView() {
        System.out.println("What type of issues you want to view?");
        showAllIssueTypes();
    }

    private static void showAllIssueTypes() {
        System.out.println("Please type one of the following options: ");
        System.out.println("\t - BUG");
        System.out.println("\t - TASK");
        System.out.println("\t - STORY");
    }

    public static void showExampleInputBasedOn(IssueType issueType) {
        switch (issueType) {
            case BUG, TASK -> System.out.println("Example: Name|Description|Priority can be Minor, Medium or Major|Assignee Name|Tester Name");
            case STORY ->
                    System.out.println("Example: Name|Description|Priority can be Minor, Medium or Major|AssigneeName1,AssigneeName2,etc|TesterName1,TesterName2,etc");
        }
    }

    public static int readNumberFromConsole() {
        return Integer.parseInt(SCANNER.nextLine());
    }

    public static String readTextFromConsole() {
        return SCANNER.nextLine();
    }

    public static void printIssueInfo(Issue issue) {
        System.out.println(issue);
    }

    public static void showWhatWasSelectedForCreationBasedOn(IssueType issueType) {
        System.out.println("=== You selected to create " + issueType + " ===");
        System.out.println("Please provide following information in one line separated by | symbol");
    }

    public static void showWhatWillBeShownBasedOn(IssueType issueType) {
        System.out.println("=== You selected to view all available " + issueType + " issues ===");
    }

    public static void showByeMessage() {
        System.out.println("Thank you for using our issue tracking system! Good bye!");
    }

    public static void showMessageForSuccessAddOf(Issue issue) {
        System.out.printf("%s with name: %s has been successfully added.%n", issue.getType(), issue.getName());
    }

    public static void showMessageForFailureAddOf(Issue issue) {
        System.out.printf("%s with name: %s cannot be added. No free slots for new issues!%n",
                issue.getType(), issue.getName());
    }

    public static void showMessageForNotCreatedIssues() {
        System.out.println("Sorry, but there are no created issues! Please create any issue firstly");
    }

    public static void showMessageForNotCreatedSpecificIssue(IssueType issueType) {
        System.out.println("---> Sorry but there are no created " + issueType + " issues <---");
    }
}
