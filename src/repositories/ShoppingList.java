package repositories;
import model.ToDo;
import model.TaskBase;

import java.util.TreeSet;
import java.util.Set;

public class ShoppingList {
    String title;
    private Set<ToDo> ShoppingList = new TreeSet<>();
    //TreeSet pastreaza elementele sortate; nu pastreaza duplicate


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addAll(Set<ToDo> items) {
        ShoppingList.addAll(items);
    }
    public void add(ToDo item) {
        ShoppingList.add(item);
    }

    public Set<ToDo> getShoppingList() {
        return ShoppingList;
    }

    public void delete(ToDo item) {
        ShoppingList.remove(item);
    }
    public void deleteAll(Set<ToDo> items) {
        ShoppingList.removeAll(items);
    }

    public void clear() {
        ShoppingList.clear();
    }

    public void print() {
        System.out.println("Shopping List: " + this.title);
        for(ToDo item:ShoppingList) {
            item.print();
           // System.out.println('\n');
        }
    }
}
