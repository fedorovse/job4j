package ru.job4j.array;

/**
 * Class FindLoop Работа с массивами
 * @author Sergey Fedorov (ingor-ru@mail.ru)
 * @since 09.01.2020
 * @version 1
 */
public class FindLoop {

    /**
     * Method indexOf ищет в массиве заданный элемент. Если находит - возвращает его индекс, иначе -1.
     * @param data int[] - массив
     * @param el int - искомый элемент
     * @return index int - возвращает индекс заданного элемента или -1 если такого элемента нет.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
