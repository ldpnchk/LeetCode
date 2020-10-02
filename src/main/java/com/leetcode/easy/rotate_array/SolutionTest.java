package com.leetcode.easy.rotate_array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    @Test
    public void test_1() {

        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        new Solution().rotate(nums, k);

        int[] expected = { 5, 6, 7, 1, 2, 3, 4 };

        assertArrayEquals(expected, nums);
    }

    @Test
    public void test_2() {

        int[] nums = { -1, -100, 3, 99 };
        int k = 2;
        new Solution().rotate(nums, k);

        int[] expected = { 3, 99, -1, -100 };

        assertArrayEquals(expected, nums);
    }

    @Test
    public void test_3() {

        int[] nums = { 1 };
        int k = 2;
        new Solution().rotate(nums, k);

        int[] expected = { 1 };

        assertArrayEquals(expected, nums);
    }

    @Test
    public void test_4() {

        int[] nums = { 1, 2 };
        int k = 2;
        new Solution().rotate(nums, k);

        int[] expected = { 1, 2 };

        assertArrayEquals(expected, nums);
    }

}
