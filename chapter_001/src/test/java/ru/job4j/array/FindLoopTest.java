package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop findLoop = new FindLoop();
        int[] input = {5, 11, 0};
        int value = 5;
        int result = findLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas32Then3() {
        FindLoop findLoop = new FindLoop();
        int[] input = {7, 1, 76, 32, 48, 15};
        int value = 32;
        int result = findLoop.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas16ThenNotFind() {
        FindLoop findLoop = new FindLoop();
        int[] input = {7, 1, 76, 32, 48, 15};
        int value = 16;
        int result = findLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    public void whenArrayHas3Then5() {
        FindLoop findLoop = new FindLoop();
        int[] input = {7, 1, 76, 32, 48, 3, 7, 1};
        int value = 3;
        int start = 2;
        int finish = 6;
        int result = findLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas8ThenNotFind() {
        FindLoop findLoop = new FindLoop();
        int[] input = {7, 1, 76, 32, 48, 15};
        int value = 8;
        int start = 1;
        int finish = 4;
        int result = findLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenStartMoreThanFinish() {
        FindLoop findLoop = new FindLoop();
        int[] input = {7, 1, 76, 32, 48, 15};
        int value = 8;
        int start = 3;
        int finish = 2;
        int result = findLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}
