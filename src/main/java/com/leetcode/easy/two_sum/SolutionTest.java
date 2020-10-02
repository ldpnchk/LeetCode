package com.leetcode.easy.two_sum;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    @Test
    public void test_1() {

        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] actual = new Solution().twoSum(nums, target);

        int[] expected = { 0, 1 };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_2() {

        int[] nums = { 3, 2, 4 };
        int target = 6;
        int[] actual = new Solution().twoSum(nums, target);

        int[] expected = { 1, 2 };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_3() {

        int[] nums = { 3, 3 };
        int target = 6;
        int[] actual = new Solution().twoSum(nums, target);

        int[] expected = { 0, 1 };

        assertArrayEquals(expected, actual);
    }

}
