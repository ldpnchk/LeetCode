package com.leetcode.easy.reverse_integer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test_1() {

        int x = 123;
        int actualResult = new Solution().reverse(x);

        int expectedResult = 321;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test_2() {

        int x = -123;
        int actualResult = new Solution().reverse(x);

        int expectedResult = -321;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test_3() {

        int x = 120;
        int actualResult = new Solution().reverse(x);

        int expectedResult = 21;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test_4() {

        int x = 1534236469;
        int actualResult = new Solution().reverse(x);

        int expectedResult = 0;

        assertEquals(expectedResult, actualResult);
    }

}
