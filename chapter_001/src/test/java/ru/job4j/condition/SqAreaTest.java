package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square1 () {
        int inPerimeter = 6;
        int inCoefficient = 2;
        double expected = 2;
        double out = SqArea.square(inPerimeter, inCoefficient);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square2 () {
        int inPerimeter = 4;
        int inCoefficient = 1;
        double expected = 1;
        double out = SqArea.square(inPerimeter, inCoefficient);
        Assert.assertEquals(expected, out, 0.01);
    }
}
