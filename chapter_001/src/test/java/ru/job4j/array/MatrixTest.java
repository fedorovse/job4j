package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MatrixTest {

    @Test
    public void when2On2() {
        Matrix matrix = new Matrix();
        int size = 2;
        int[][] result = matrix.multiple(size);
        int[][] expect = {
                {1, 2},
                {2, 4}
        };
        assertThat(result, is(expect));
    }

    @Test
    public void when3On3() {
        Matrix matrix = new Matrix();
        int size = 3;
        int[][] result = matrix.multiple(size);
        int[][] expect = {
                {1, 2, 3},
                {2, 4, 6},
                {3, 6, 9}
        };
        assertThat(result, is(expect));
    }
}
