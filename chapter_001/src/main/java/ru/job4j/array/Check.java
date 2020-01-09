package ru.job4j.array;

/**
 * Class Check работа с массивом boolean
 * @author Sergey Fedorov (ingor-ru@mail.ru)
 * @since 09.01.2020
 * @version 1
 */
public class Check {

    /**
     * Method mono - проверяет массив на однородность значений. Если все false или true то вернет true. Если значения в
     * массиве разные, то вернет false/
     * @param data boolean[]
     * @return true если в массиве все значения одинаковые. Иначе false.
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        boolean first = data[0];
        for (int index = 1; index < data.length; index++) {
            if (data[index] != first) {
                result = false;
                break;
            }
        }
        return result;
    }
}
