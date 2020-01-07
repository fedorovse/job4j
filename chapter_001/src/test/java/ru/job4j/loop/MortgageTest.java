package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MortgageTest {

    @Test
    public void when1Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(1000, 1200, 1);
        assertThat(1, is(year));
    }

    @Test
    public void when2Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(100, 120, 50);
        assertThat(2, is(year));
    }

    @Test
    public void when10000Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(100, 12, 100);
        assertThat(0, is(year));
    }
}
