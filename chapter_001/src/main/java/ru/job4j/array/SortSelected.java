package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        int tmp;
        for (int index = 0; index < data.length; index++) {
            int min = MinDiapason.findMin(data, index, data.length - 1);
            int indexMin = FindLoop.indexOf(data, min, index, data.length - 1);
            tmp = data[indexMin];
            data[indexMin] = data[index];
            data[index] = tmp;
        }
        return data;
    }
}
