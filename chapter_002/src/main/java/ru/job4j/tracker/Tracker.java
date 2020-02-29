package ru.job4j.tracker;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
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
    private final ArrayList<Item> items = new ArrayList<>();
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
        position++;
        items.add(item);
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
    public ArrayList<Item> findAll() {
        items.trimToSize();
        return items;
    }

    /**
     * Поиск в хранилище всех заявок с заданным именем
     * @param key имя заявки
     * @return хранилище с найдеными заявками
     */
    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> names = new ArrayList<>();
        for (int index = 0; index < position; index++) {
            if (this.items.get(index).getName().equals(key)) {
                names.add(this.items.get(index));
            }
        }
        names.trimToSize();
        return names;
    }

    /**
     * Поиск заявки по id
     * @param id - заявки
     * @return заявка с заданным id либо Null если такой нет в хранилище
     */
    public Item findById(String id) {
        Item findItem = null;
        int index = indexOf(id);
        if (index >= 0) {
            findItem = items.get(index);
        }
        return findItem;
    }

    /**
     * Замена существующей заявки на другую. При этом id сохраняется.
     * @param id - заявки, которую необходимо заменить
     * @param item - новая заявка
     */
    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        boolean result = false;
        if (index >= 0) {
            item.setId(id);
            items.set(index, item);
            result = true;
        }
        return result;
    }

    private int indexOf(String id) {
        int result = -1;
        for (int index = 0; index < position; index++) {
            if (items.get(index).getId().equals(id)) {
                result = index;
                break;
            }
        }
        return result;
    }

    /**
     * Удаление заявки. Массив сдвигается заполняя дырку.
     * @param id - заявки
     */
    public boolean delete(String id) {
        int index = indexOf(id);
        boolean result = false;
        if (index >= 0) {
            items.remove(index);
            position--;
            result = true;
        }
        return result;
    }
}
