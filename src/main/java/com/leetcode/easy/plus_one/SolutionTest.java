package com.leetcode.easy.plus_one;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    @Test
    public void test_1() {

        int[] digits = { 1, 2, 3 };
        int[] actual = new Solution().plusOne(digits);

        int[] expected = { 1, 2, 4 };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_2() {

        int[] digits = { 4, 3, 2, 1 };
        int[] actual = new Solution().plusOne(digits);

        int[] expected = { 4, 3, 2, 2 };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_3() {

        int[] digits = { 0 };
        int[] actual = new Solution().plusOne(digits);

        int[] expected = { 1 };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_4() {

        int[] digits = { 9, 9, 9 };
        int[] actual = new Solution().plusOne(digits);

        int[] expected = { 1, 0, 0, 0 };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_5() {

        int[] digits = { 1, 5, 9 };
        int[] actual = new Solution().plusOne(digits);

        int[] expected = { 1, 6, 0 };

        assertArrayEquals(expected, actual);
    }

}
