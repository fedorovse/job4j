package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3To3Then3() {
        int result = Max.max(3, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMaxFirstFrom3() {
        int result = Max.max(5, 3, 3);
        int expect = 5;
        assertThat(result, is(expect));
    }

    @Test
    public void whenMaxThirdFrom3() {
        int result = Max.max(5, 3, 12);
        int expect = 12;
        assertThat(result, is(expect));
    }

    @Test
    public void whenMaxSecondFrom4() {
        int result = Max.max(5, 6, 3, 2);
        int expect = 6;
        assertThat(result, is(expect));
    }

    @Test
    public void whenMaxFourthFrom4() {
        int result = Max.max(5, 6, 3, 9);
        int expect = 9;
        assertThat(result, is(expect));
    }
}
