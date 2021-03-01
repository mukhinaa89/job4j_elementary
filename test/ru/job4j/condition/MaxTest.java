package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3To1Then3() {
        int result = Max.max(3, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenFirst2Second2Then2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenFirst3Second2Third1Then3() {
        int result = Max.max(3, 2, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenFirst3Second5Third3Then5() {
        int result = Max.max(3, 5, 3);
        assertThat(result, is(5));
    }

    @Test
    public void whenFirst4Second5Third6Then6() {
        int result = Max.max(4, 5, 6);
        assertThat(result, is(6));
    }

    @Test
    public void whenFirst3Second3Third3Then3() {
        int result = Max.max(3, 3, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenFirst1Second2Third3Four4Then3() {
        int result = Max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirst1Second2Third5Four3Then5() {
        int result = Max.max(1, 2, 5, 3);
        assertThat(result, is(5));
    }

    @Test
    public void whenFirst1Second6Third2Four3Then6() {
        int result = Max.max(1, 6, 2, 3);
        assertThat(result, is(6));
    }

    @Test
    public void whenFirst7Second1Third2Four3Then6() {
        int result = Max.max(7, 1, 2, 3);
        assertThat(result, is(7));
    }

    @Test
    public void whenFirst8Second8Third8Four8Then8() {
        int result = Max.max(8, 8, 8, 8);
        assertThat(result, is(8));
    }
}