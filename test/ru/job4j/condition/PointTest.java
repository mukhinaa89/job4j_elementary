package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to71then6() {
        int expexted = 6;
        int x1 = 1;
        int y1 = 1;
        int x2 = 7;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expexted, out, 0.01);
    }

    @Test
    public void whenMinus13toMinus4Minus1then5() {
        int expexted = 5;
        int x1 = -1;
        int y1 = 3;
        int x2 = -4;
        int y2 = -1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expexted, out, 0.01);
    }

    @Test
    public void when22to23then1() {
        int expexted = 1;
        int x1 = 2;
        int y1 = 2;
        int x2 = 2;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expexted, out, 0.01);
    }
}