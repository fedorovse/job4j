package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance1 () {
        int inX1 = 8;
        int inY1 = 3;
        int inX2 = 6;
        int inY2 = 5;
        double expected = 2.828427;
        double out = Point.distance(inX1, inY1, inX2, inY2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance2 () {
        int inX1 = 0;
        int inY1 = 0;
        int inX2 = 2;
        int inY2 = 0;
        double expected = 2.0;
        double out = Point.distance(inX1, inY1, inX2, inY2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
