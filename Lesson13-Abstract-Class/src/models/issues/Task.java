package models.issues;

import enums.IssueType;
import enums.Priority;
import models.employees.Assignee;
import models.employees.Tester;

public class Task extends Issue {

    public Task(String name, String description, Priority priority, Assignee assignee, Tester tester) {
        super(name, description, priority, assignee, tester);
        super.setType(IssueType.TASK);
    }
}
