package model;

public class Workout extends TaskBase{

    private String type;

    public Workout(int id, String title, String type) {
        super(id, title);
        this.type = type;
    }

    public void setType(String type) {

        this.type = type;
    }

    public String getType() {

        return type;
    }
}
