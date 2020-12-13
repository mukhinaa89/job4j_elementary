package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2then2() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12K5then5() {
        int expected = 5;
        int p = 12;
        int k = 5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP0K0then0() {
        int expected = 0;
        int p = 0;
        int k = 0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}