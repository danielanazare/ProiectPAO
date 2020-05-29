package model;

public class ToDo extends TaskBase implements Comparable<ToDo> {
    boolean done = false;

    public ToDo(int id, String title, boolean done) {
        super(id, title);
        this.done = done;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public int compareTo(ToDo o) {
        return this.title.compareTo(o.getTitle());
    }

    public void print() {
        System.out.println(this.id +  " " + this.title + " " + this.done);
    }
}
