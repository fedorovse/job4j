package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
public class DiapasonFunctionTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        DiapasonFunction function = new DiapasonFunction();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D, 17D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenLinearResults() {
        DiapasonFunction function = new DiapasonFunction();
        List<Double> result = function.diapason(2, 7, x -> x * x);
        List<Double> expected = Arrays.asList(4D, 9D, 16D, 25D, 36D, 49D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenLinearResults() {
        DiapasonFunction function = new DiapasonFunction();
        List<Double> result = function.diapason(2, 5, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(4D, 8D, 16D, 32D);
        assertThat(result, is(expected));
    }
}
