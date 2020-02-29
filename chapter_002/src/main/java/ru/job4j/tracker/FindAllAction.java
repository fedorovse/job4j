package ru.job4j.tracker;

import java.util.ArrayList;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== All Items ====");
        ArrayList<Item> items = tracker.findAll();
        for (int index = 0; index < items.size(); index++) {
            System.out.println("Order № " + (index + 1)
                    + " name: " + items.get(index).getName()
                    + " id: " + items.get(index).getId());
        }
        return true;
    }
}
