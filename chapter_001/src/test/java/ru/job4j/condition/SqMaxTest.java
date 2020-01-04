package ru.job4j.condition;

import  org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {

    @Test
    public void whenFirstMax() {
        SqMax check = new SqMax();
        int result = check.max(5, 3, 1, 2);
        assertThat(result, is(5));
    }

    @Test
    public void whenSecondMax() {
        SqMax check = new SqMax();
        int result = check.max(1, 4, 2, 3);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        SqMax check = new SqMax();
        int result = check.max(5, 3, 8, 4);
        assertThat(result, is(8));
    }

    @Test
    public void whenForthMax() {
        SqMax check = new SqMax();
        int result = check.max(5, 3, 6, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenEqual() {
        SqMax check = new SqMax();
        int result = check.max(3, 3, 3,3);
        assertThat(result, is(3));

    }
}
