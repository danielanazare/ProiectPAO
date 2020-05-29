package model;

public class TaskBase {
    int id;
    String title;

//    public TaskBase() {}

    public TaskBase(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }
}
