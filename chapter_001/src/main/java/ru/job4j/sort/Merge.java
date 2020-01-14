package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int iLeft = 0;
        int iRight = 0;
        int iRsl = 0;
        while (iLeft + iRight < rsl.length) {
            if (iLeft == left.length) {
                rsl[iRsl] = right[iRight];
                iRight++;
            } else if (iRight == right.length) {
                rsl[iRsl] = left[iLeft];
                iLeft++;
            } else if (left[iLeft] <= right[iRight]) {
                rsl[iRsl] = left[iLeft];
                iLeft++;
            } else if (right[iRight] <= left[iLeft]) {
                rsl[iRsl] = right[iRight];
                iRight++;
            }
            iRsl++;
        }
        return rsl;
    }
}
