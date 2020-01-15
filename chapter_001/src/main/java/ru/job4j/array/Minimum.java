package ru.job4j.array;

public class Minimum {

    public static int findMin(int[] data) {
        int min = data[0];
        for (int index = 1; index < data.length; index++) {
            if (data[index] < min) {
                min = data[index];
            }
        }
        return min;
    }
}
