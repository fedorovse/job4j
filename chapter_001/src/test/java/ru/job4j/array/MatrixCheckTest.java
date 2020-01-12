package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        int row = 1;
        char[][] input = {
                {' ', ' ', 'a'},
                {'X', 'X', 'X'},
                {'a', 'a', 'a'}
        };
        boolean result = MatrixCheck.monoHorizontal(input, row);
        boolean expect = true;
        assertThat(result, is(expect));
    }

    @Test
    public void whenHasNotMonoHorizontal() {
        int row = 1;
        char[][] input = {
                {' ', ' ', 'a'},
                {'X', 'X', 'a'},
                {'a', 'a', ' '}
        };
        boolean result = MatrixCheck.monoHorizontal(input, row);
        boolean expect = false;
        assertThat(result, is(expect));
    }
}
