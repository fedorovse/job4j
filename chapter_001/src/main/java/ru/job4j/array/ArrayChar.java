package ru.job4j.array;

/**
 * Class ArrayChar - работа с массивом символов
 * @author Sergey Fedorov (ingor-ru@mail.ru)
 * @since 09.01.2020
 * @version 1
 */
public class ArrayChar {

    /**
     * Method startsWith - сравнивает массивы символов. Если массив pref совпадает с началом
     * массива word - возвращает true. Массив pref <= word по длинне
     * @param word char[]
     * @param pref char[]
     * @return result boolean
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (pref[index] != word[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
