package service;

import model.ToDo;
import repositories.ShoppingList;
import repositories.TaskList;

public class TaskManagerService {
//    private TaskManagerService() {
//
//    }
    public ShoppingList addShoppingList(String[] items) {
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.setTitle(items[0]);
        for(int i = 1; i < items.length; i++){
            shoppingList.add(new ToDo(i, items[i], false));
        }
        return shoppingList;
    }

//    public TaskList addTaskList(String) {
//
//    }
}
