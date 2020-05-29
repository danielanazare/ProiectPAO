package model;

import repositories.LabelCollection;

import java.util.Date;

public class Task extends ToDo{
    int id;
    Date deadline;
    LabelCollection labels = new LabelCollection();
    String description;

    public Task(int id, String title) {
        super(id, title, false);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LabelCollection getLabels() {
        return labels;
    }

    public void setLabels(LabelCollection labels) {
        this.labels = labels;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
}
