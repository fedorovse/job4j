package ru.job4j.loop;

import org.junit.Test;

import java.util.concurrent.Callable;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        //напишите здесь тест, проверяющий, что сумма чётных чисел от 1 до 10 при вызове метода counter.add будет равна 30.
        Counter checkSum = new Counter();
        int result = checkSum.add(1,10);
        assertThat(result, is(30));
    }

    @Test
    public void whenSumEvenNumbersFromSevenToTwentyThenNinetyEight() {
        //тест, проверяющий, что сумма чётных чисел от 7 до 20 при вызове метода counter.add будет равна 98.
        Counter checkSum = new Counter();
        int result = checkSum.add(7,20);
        assertThat(result, is(98));
    }
}
