package models.issues;

import enums.IssueType;
import enums.Priority;
import models.employees.Assignee;
import models.employees.Tester;

public class Story extends Issue {

    private Assignee[] assignees;
    private Tester[] testers;

    public Story(String name, String description, Priority priority, Assignee[] assignees, Tester[] testers) {
        super(name, description, priority);
        this.assignees = assignees;
        this.testers = testers;
        super.setType(IssueType.STORY);
    }
}
