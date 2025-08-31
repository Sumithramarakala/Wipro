package com.example.model;

public enum TaskStatus {
    PENDING("Pending", "bg-secondary"),
    IN_PROGRESS("In Progress", "bg-primary"),
    COMPLETED("Completed", "bg-success"),
    DELAYED("Delayed", "bg-danger");

    private final String displayName;
    private final String styleClass;

    TaskStatus(String displayName, String styleClass) {
        this.displayName = displayName;
        this.styleClass = styleClass;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getStyleClass() {
        return styleClass;
    }
}
