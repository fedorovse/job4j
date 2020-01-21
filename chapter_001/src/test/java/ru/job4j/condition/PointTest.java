package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance1() {
        int inX1 = 8;
        int inY1 = 3;
        Point a = new Point(inX1, inY1);
        int inX2 = 6;
        int inY2 = 5;
        Point b = new Point(inX2, inY2);
        double expected = 2.828427;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance2() {
        int inX1 = 0;
        int inY1 = 0;
        Point a = new Point(inX1, inY1);
        int inX2 = 2;
        int inY2 = 0;
        Point b = new Point(inX2, inY2);
        double expected = 2.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
