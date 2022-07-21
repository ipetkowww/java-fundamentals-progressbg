package models.issues;

import enums.IssueType;
import enums.Priority;
import models.employees.Assignee;
import models.employees.Tester;

public abstract class Issue {

    private String name;
    private final String description;
    private final Priority priority;
    private Assignee assignee;
    private Tester tester;
    private IssueType type;

    protected Issue(String name, String description, Priority priority, Assignee assignee, Tester tester) {
        this(name, description, priority);
        this.assignee = assignee;
        this.tester = tester;
    }

    protected Issue(String name, String description, Priority priority) {
        setName(name);
        this.description = description;
        this.priority = priority;
    }

    protected void setType(IssueType type) {
        this.type = type;
    }

    private void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Unnamed task";
        }
    }

    //TODO: add private setters with validation
}
