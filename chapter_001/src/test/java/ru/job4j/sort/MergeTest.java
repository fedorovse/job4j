package ru.job4j.sort;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MergeTest {

    @Test
    public void whenBothEmpty() {
        Merge algo = new Merge();
        int[] result = algo.merge(
                new int[0],
                new int[0]
        );
        int[] expect = new int[0];
        assertThat(result, is(expect));
    }

    @Test
    public void whenAscOrder() {
        Merge algo = new Merge();
        int[] result = algo.merge(
                new int[] {1, 2},
                new int[] {3, 4}
        );
        int[] expect = {1, 2, 3, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftLess() {
        Merge algo = new Merge();
        int[] result = algo.merge(
                new int[] {1, 2, 3},
                new int[] {3, 4}
        );
        int[] expect = {1, 2, 3, 3, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftGreat() {
        Merge algo = new Merge();
        int[] result = algo.merge(
                new int[] {1, 2},
                new int[] {3, 4, 4}
        );
        int[] expect = {1, 2, 3, 4, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftEmpty() {
        Merge algo = new Merge();
        int[] result = algo.merge(
                new int[] {},
                new int[] {2, 3, 4, 5}
        );
        int[] expect = {2, 3, 4, 5};
        assertThat(result, is(expect));
    }


}
