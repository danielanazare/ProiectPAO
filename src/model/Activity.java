package model;

import java.util.Date;

public class Activity{
    TaskBase activity;
    Date startDate;
    int lengthMin;

    public Activity(TaskBase activity, Date startDate) {
        this.activity = activity;
        this.startDate = startDate;
    }

    public void setLengthMin(int lengthMin) {
        this.lengthMin = lengthMin;
    }
    public int getLengthMin() {
        return lengthMin;
    }
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }


}
