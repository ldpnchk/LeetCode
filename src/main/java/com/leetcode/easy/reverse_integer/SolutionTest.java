package com.leetcode.easy.reverse_integer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test_1() {

        int x = 123;
        int actual = new Solution().reverse(x);

        int expected = 321;

        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {

        int x = -123;
        int actual = new Solution().reverse(x);

        int expected = -321;

        assertEquals(expected, actual);
    }

    @Test
    public void test_3() {

        int x = 120;
        int actual = new Solution().reverse(x);

        int expected = 21;

        assertEquals(expected, actual);
    }

    @Test
    public void test_4() {

        int x = 1534236469;
        int actual = new Solution().reverse(x);

        int expected = 0;

        assertEquals(expected, actual);
    }

}
