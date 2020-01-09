package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] input = {1, 2, 3, 4};
        int[] resultArray = turn.back(input);
        int[] expect = {4, 3, 2, 1};
        assertThat(resultArray, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] input = {1, 2, 3, 4, 8};
        int[] resultArray = turn.back(input);
        int[] expect = {8, 4, 3, 2, 1};
        assertThat(resultArray, is(expect));
    }
}
