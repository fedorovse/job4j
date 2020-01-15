package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class PrimeNumberTest {

    @Test
    public void when5() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calculation(5);
        assertThat(3, is(count));
    }

    @Test
    public void when11() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calculation(11);
        assertThat(5, is(count));
    }

    @Test
    public void when2() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calculation(2);
        assertThat(1, is(count));
    }

    @Test
    public void when1() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calculation(1);
        assertThat(0, is(count));
    }
}
