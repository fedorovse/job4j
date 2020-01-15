package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        // Тест, проверяющий, что факториал для числа 5 равен 120.
        Factorial checkFactorial = new Factorial();
        int result = checkFactorial.calculation(5);
        assertThat(result, is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        // Тест, проверяющий, что факториал для числа 0 равен 1.
        Factorial checkFactorial = new Factorial();
        int result = checkFactorial.calculation(0);
        assertThat(result, is(1));
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        // Тест, проверяющий, что факториал для числа 1 равен 1.
        Factorial checkFactorial = new Factorial();
        int result = checkFactorial.calculation(1);
        assertThat(result, is(1));
    }
}
