package models;

import enums.Priority;
import models.employees.Employee;
import models.issues.Bug;
import models.issues.Issue;
import models.issues.Story;
import models.issues.Task;
import models.employees.Assignee;
import models.employees.Tester;

public class IssueBoard {

    private Issue[] issues;
    private int freeSlots;

    public IssueBoard(Issue[] issues) {
        this.issues = issues;
        this.freeSlots = issues.length;
    }

    public void addIssue(Issue issue) {
        issues[issues.length - freeSlots] = issue;
        freeSlots--;
    }

    public Bug createBug(String[] bugInfo) {
        return new Bug(bugInfo[0], bugInfo[1], Priority.valueOf(bugInfo[2].toUpperCase()),
                new Assignee(bugInfo[3]), new Tester(bugInfo[4]));
    }

    public Task createTask(String[] taskInfo) {
        return new Task(taskInfo[0], taskInfo[1], Priority.valueOf(taskInfo[2].toUpperCase()),
                new Assignee(taskInfo[3]), new Tester(taskInfo[4]));
    }

    public Story createStory(String[] storyInfo) {
        String[] assigneesInfo = storyInfo[3].split(",");
        Assignee[] assignees = new Assignee[assigneesInfo.length];
        for (int i = 0; i < assignees.length; i++) {
            assignees[i] = new Assignee(assigneesInfo[i]);
        }

        String[] testersInfo = storyInfo[4].split(",");
        Tester[] testers = new Tester[testersInfo.length];
        for (int i = 0; i < assignees.length; i++) {
            testers[i] = new Tester(testersInfo[i]);
        }

        return new Story(storyInfo[0], storyInfo[1], Priority.valueOf(storyInfo[2].toUpperCase()), assignees, testers);
    }
}
