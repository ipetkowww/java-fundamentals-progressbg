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
                    showIssueMenuForCreate();
                    IssueType issueType = IssueType.valueOf(readTextFromConsole().toUpperCase());
                    showWhatWasSelectedForCreationBasedOn(issueType);
                    showExampleInputBasedOn(issueType);
                    String[] issueInfo = readTextFromConsole().split("\\|");

                    Issue issue = switch (issueType) {
                        case BUG -> issueBoard.createBug(issueInfo);
                        case TASK -> issueBoard.createTask(issueInfo);
                        case STORY -> issueBoard.createStory(issueInfo);
                    };
                    boolean added = issueBoard.addIssue(issue);
                    if (added) {
                        showMessageForSuccessAddOf(issue);
                    } else {
                        showMessageForFailureAddOf(issue);
                    }
                }
                case 2 -> {
                    showIssueMenuForView();
                    IssueType issueType = IssueType.valueOf(readTextFromConsole().toUpperCase());

                    if (issues[0] != null) {
                        showWhatWillBeShownBasedOn(issueType);
                        boolean foundIssue = false;
                        for (Issue issue : issues) {
                            if (issue != null && issue.getType().equals(issueType)) {
                                printIssueInfo(issue);
                                foundIssue = true;
                            }
                        }
                        if (!foundIssue) {
                            showMessageForNotCreatedSpecificIssue(issueType);
                        }
                    } else {
                        showMessageForNotCreatedIssues();
                    }
                }
                case 3 -> {
                    showByeMessage();
                    return;
                }
            }
        }
    }
}
