package repositories;

import model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<Task> TaskList = new ArrayList<Task>();

    String name;
    String description;

    ///

    public void addTask(Task task) {
        TaskList.add(task);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
