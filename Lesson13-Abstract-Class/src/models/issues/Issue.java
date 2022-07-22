package models.issues;

import enums.IssueType;
import enums.Priority;
import models.employees.Assignee;
import models.employees.Tester;

import static utils.Constants.NO_DESCRIPTION;
import static utils.Constants.UNNAMED;
import static utils.Validation.validateString;

public abstract class Issue {

    private final String name;
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
        this.name = validateString(name) ? name : UNNAMED;
        this.description = validateString(description) ? description : NO_DESCRIPTION;
        this.priority = priority;
    }

    protected void setType(IssueType type) {
        this.type = type;
    }

    public IssueType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Issue: %s, Name: %s, Description: %s, Priority: %s, Assignee: %s, Tester: %s",
                getType(), name, description, priority, assignee.getName(), tester.getName());
    }
}
