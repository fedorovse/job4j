package ru.job4j.array;

/**
 * Class Square
 * @author Sergey Fedorov
 * @since 08.01.2020
 * @version 1
 */
public class Square {

    /**
     * method calculate возвращает массив заданной длинны заполненый натуральными числами возведенными в квадрат
     * @param bound int - размер массива
     * @return int[] - массив размером bound
     */
    public int[] calculate(int bound) {
        int[] result = new int[bound];
        for (int index = 0; index < bound; index++) {
            result[index] = (index + 1) * (index + 1);
        }
        return result;
    }
}
