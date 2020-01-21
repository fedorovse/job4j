package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenAreaTrue() {
        Point a = new Point(2, 0);
        Point b = new Point(0, 0);
        Point c = new Point(0, 2);
        Triangle inputTriangle = new Triangle(a, b, c);
        double result = inputTriangle.area();
        double expect = 2;
        Assert.assertEquals(expect, result, 0.01);
    }

    @Test
    public void whenAreaFalse() {
        Point a = new Point(5, 0);
        Point b = new Point(0, 0);
        Point c = new Point(2, 0);
        Triangle inputTriangle = new Triangle(a, b, c);
        double result = inputTriangle.area();
        double expect = -1;
        Assert.assertEquals(expect, result, 0.01);
    }
}
