package main;

import enums.IssueType;
import models.IssueBoard;
import models.issues.Issue;

import static utils.Console.*;

public class IssueTrackingSystem {


    static void start() {
        greetingMessage();
        int issuesCount = readNumberFromConsole();
        Issue[] issues = new Issue[issuesCount];
        IssueBoard issueBoard = new IssueBoard(issues);

        while (true) {
            showMenuOptions();
            int choice = readNumberFromConsole();

            switch (choice) {
                case 1 -> {
                    showIssueMenuOptions();

                    IssueType issueType = IssueType.valueOf(readTextFromConsole().toUpperCase());
                    System.out.println("=== You selected to create " + issueType + " ===");
                    System.out.println("Please provide following information in one line separated by | symbol");

                    showExampleInputBasedOn(issueType);

                    String[] issueInfo = readTextFromConsole().split("\\|");

                    Issue issue = switch (issueType) {
                        case BUG -> issueBoard.createBug(issueInfo);
                        case TASK -> issueBoard.createTask(issueInfo);
                        case STORY -> issueBoard.createStory(issueInfo);
                    };
                    issueBoard.addIssue(issue);
                    //TODO: add a message whether the issues is added or not
                }
                case 3 -> {
                    System.out.println("Bye");
                    return;
                }
            }


        }
    }


}
