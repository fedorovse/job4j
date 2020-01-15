package ru.job4j.array;

/**
 * Class Defragment
 * @author Sergey Fedorov (ingor-ru@mail.ru)
 * @since 12.01.2020
 * @version 1
 */
public class Defragmentation {

    /**
     * Method compress - дефрагментирует строковый массив. Смещает все значения null в конец массива.
     * @param array String[] - не дефрагментированный массив.
     * @return String[] - массив в котором все значения null смещены в конец массива.
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            if (cell == null) {
                int i = index;
                while (i < array.length) {
                    if (array[i] != null) {
                        String tmp = array[i];
                        array[i] = null;
                        array[index] = tmp;
                        break;
                    }
                    i++;
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
