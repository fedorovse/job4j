package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * Это хранилище заявок и методы работы с ними
 * @version $Id$
 * @since 0.1
 */
public class Tracker {

    /**
     * Массив для хранения заявок
     */
    private final Item[] items = new Item[100];
    /**
     * Указатель на ячейку для новой заявки
     */
    private int position = 0;

    /**
     * Добавляет заявку в хранилище
     * @param item - новая заявка без id
     * @return заявку с id
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items[position++] = item;
        return item;
    }

    /**
     * Генерирует уникальный id для заявки
     * @return id в строке
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Убирает пустые ячейки из хранилища заявок
     * @return хранилище заявок без пустых ячеек
     */
    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[this.items.length];
        int size = 0;
        for (int index = 0; index < this.items.length; index++) {
            if (this.items[index] != null) {
                itemsWithoutNull[size] = this.items[index];
                size++;
            }
        }
        itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, size);
        return itemsWithoutNull;
    }

    /**
     * Поиск в хранилище всех заявок с заданным именем
     * @param key имя заявки
     * @return хранилище с найдеными заявками
     */
    public Item[] findByName(String key) {
        Item[] names = new Item[this.items.length];
        int size = 0;
        for (int index = 0; index < this.items.length; index++) {
            if (this.items[index] != null && this.items[index].getName().equals(key)) {
                names[size] = this.items[index];
                size++;
            }
        }
        names = Arrays.copyOf(names, size);
        return names;
    }

    /**
     * Поиск заявки по id
     * @param id - заявки
     * @return заявка с заданным id либо Null если такой нет в хранилище
     */
    public Item findById(String id) {
        Item findItem = null;
        for (int index = 0; index < this.items.length; index++) {
            if (this.items[index] != null && this.items[index].getId().equals(id)) {
                findItem = this.items[index];
                break;
            }
        }
        return findItem;
    }
}
