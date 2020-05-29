package repositories;

import model.Activity;

import java.util.Set;
import java.util.TreeSet;

public class Schedule {
    Set<Activity> schedule = new TreeSet<Activity>();

    //addAll add delete deleteAll clear

    public void add(Activity activity) {
        this.schedule.add(activity);
    }
    public void addAll(Set<Activity> schedule) {
        this.schedule.addAll(schedule);
    }

    public void delete(Activity activity) {
        schedule.remove(activity);
    }
    public void deleteAll(Set<Activity> schedule) {
        this.schedule.removeAll(schedule);
    }
}
