package ru.job4j.tracker;

public class FindByNameAction implements  UserAction {
    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find Item by name ====");
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length == 0) {
            System.out.println("Order with name: " + name + " not found");
        } else {
            for (int index = 0; index < items.length; index++) {
                System.out.println("Order № " + (index + 1)
                        + " name: " + items[index].getName()
                        + " id: " + items[index].getId());
            }
        }
        return true;
    }
}
