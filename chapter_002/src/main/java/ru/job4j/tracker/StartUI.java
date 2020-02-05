package ru.job4j.tracker;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Order with the name : " + name + " created");
    }

    public static void showAllItems(Tracker tracker) {
        System.out.println("=== All Items ====");
        Item[] items = tracker.findAll();
        for (int index = 0; index < items.length; index++) {
            System.out.println("Order № " + (index + 1)
                    + " name: " + items[index].getName()
                    + " id: " + items[index].getId());
        }
    }

    public static void editItem(Input input, Tracker tracker) {
        System.out.println("=== Edit Item ====");
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter new name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("The order with id: " + id + " has been replaced");
        } else {
            System.out.println("The order with id: " + id + " not found");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete Item ====");
        String id = input.askStr("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Order with id: " + id + " deleted");
        } else {
            System.out.println("Order with id: " + id + " not found");
        }
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Find Item by id ====");
        String id = input.askStr("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(" Name: " + item.getName() + " id: " + item.getId());
        } else {
            System.out.println("No order with this id ");
        }
    }

    public static void findItemByName(Input input, Tracker tracker) {
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
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr(" "));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showAllItems(tracker);
            } else if (select == 2) {
                StartUI.editItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemById(input, tracker);
            } else if (select == 5) {
                StartUI.findItemByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.print("Select:");
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
