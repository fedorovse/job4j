package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int iLeft = 0;
        int iRight = 0;
        int iRsl = 0;
        while (iLeft + iRight < result.length) {
            if (iLeft == left.length) {
                result[iRsl] = right[iRight];
                iRight++;
            } else if (iRight == right.length) {
                result[iRsl] = left[iLeft];
                iLeft++;
            } else if (left[iLeft] <= right[iRight]) {
                result[iRsl] = left[iLeft];
                iLeft++;
            } else if (right[iRight] <= left[iLeft]) {
                result[iRsl] = right[iRight];
                iRight++;
            }
            iRsl++;
        }
        return result;
    }
}
