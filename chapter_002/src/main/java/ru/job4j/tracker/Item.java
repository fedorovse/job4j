package ru.job4j.tracker;

/**
 * Это модель заявки
 */
public class Item {

    /**
     * Имя заявки
     */
    private String name;
    /**
     * Уникальный номер заявки (id)
     */
    private String id;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
