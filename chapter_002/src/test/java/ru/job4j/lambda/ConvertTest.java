package ru.job4j.lambda;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.Arrays;
import java.util.List;

public class ConvertTest {

    @Test
    public void squareArrayOfIntegersToList() {
        Integer[][] in = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Convert conv = new Convert();
        List<Integer> result = conv.convertMatrixToList(in);
        List<Integer> expect = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertThat(result, is(expect));
    }

    @Test
    public void variousArraysOfIntegersToList() {
        Integer[][] in = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
        Convert conv = new Convert();
        List<Integer> result = conv.convertMatrixToList(in);
        List<Integer> expect = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertThat(result, is(expect));
    }
}
