package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MinTest {

    @Test
    public void whenFirstMin () {
        int[] input = {3, 6, 10};
        int result = Min.findMin(input);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenLastMin () {
        assertThat(
                Min.findMin(new int [] {10, 5, 3}
                ),
                is(3)
        );
    }

    @Test
    public void whenMiddleMin () {
        assertThat(
                Min.findMin(new int[] {5, 2, 10}
                ),
                is(2)
        );
    }
}
