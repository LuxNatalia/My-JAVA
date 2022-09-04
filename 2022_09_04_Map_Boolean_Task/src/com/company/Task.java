package com.company;

public class Task {
    private int id;
    private String title;
    private String status;
    private boolean taskDone;

    public Task(int id, String title, String status) {
        this.id = id;
        this.title = title;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public boolean isTaskDone() {
        return taskDone;
    }

    public void setTaskDone(boolean taskDone) {
        this.taskDone = taskDone;
    }

    @Override
    public String toString() {
        return "{" + id + ", " + title + ", " + status +"}";
    }
}
