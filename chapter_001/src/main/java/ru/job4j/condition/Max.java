package ru.job4j.condition;

/**
 * Поиск максимальных значений из 2-х, 3-х или 4-х целых чисел
 */
public class Max {

    /**
     * method max - поиск максимального числа из двух
     * @param first int -первый аргумент
     * @param second int - второй аргумент
     * @return int - максимальное
     */
    public static int max(int first, int second) {
       return first >= second ? first : second;
    }

    /**
     * method max - поиск максимального числа из трех
     * @param first int -первый аргумент
     * @param second int - второй аргумент
     * @param third int - третий аргумент
     * @return int - максимальное
     */
    public static int max(int first, int second, int third) {
        return max(first,
                max(second, third)
        );
    }

    /**
     * method max - поиск максимального числа из четырех
     * @param first int -первый аргумент
     * @param second int - второй аргумент
     * @param third int - третий аргумент
     * @param fourth int - четвертый аргумент
     * @return int - максимальное
     */
    public static int max(int first, int second, int third, int fourth) {
        return max(first,
                max(second, third, fourth)
        );
    }
}
