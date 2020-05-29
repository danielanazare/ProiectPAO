package main;

import model.ToDo;
import repositories.ShoppingList;
import service.TaskManagerService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        TaskManagerService service = new TaskManagerService();
        ShoppingList groceries;
        //ShoppingList groceries= service.addShoppingList(["eggs", "milk", "bread"]);
        //groceries.setDone()

        Path shoppingListFile = Paths.get("G:\\FMI\\Proiect\\src\\groceries.csv");


        try {
            List<String> list = new ArrayList<String>();
            for(String row:Files.lines(shoppingListFile).collect(Collectors.toList())) {
                for(String item:row.split(",")) {
                    list.add(item);
                }

            }
            //groceries = service.addShoppingList(Files.lines(shoppingListFile).map(row -> row.split(",")).toArray(String[]::new));
            groceries = service.addShoppingList(list.toArray(new String[0]));
            //groceries.setTitle("Groceries");
            groceries.print();
        }
        catch(IOException e) {

        }


    }





}
