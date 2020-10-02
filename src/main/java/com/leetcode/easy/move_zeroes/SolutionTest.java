package com.leetcode.easy.move_zeroes;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    
    @Test
    public void test_1() {

        int[] nums = { 0, 1, 0, 3, 12 };
        new Solution().moveZeroes(nums);

        int[] expected = { 1, 3, 12, 0, 0 };

        assertArrayEquals(expected, nums);
    }

    @Test
    public void test_2() {

        int[] nums = { 0 };
        new Solution().moveZeroes(nums);

        int[] expected = { 0 };

        assertArrayEquals(expected, nums);
    }

    @Test
    public void test_3() {

        int[] nums = { 1 };
        new Solution().moveZeroes(nums);

        int[] expected = { 1 };

        assertArrayEquals(expected, nums);
    }

    @Test
    public void test_4() {

        int[] nums = { 0, 0, 0 };
        new Solution().moveZeroes(nums);

        int[] expected = { 0, 0, 0 };

        assertArrayEquals(expected, nums);
    }

    @Test
    public void test_5() {

        int[] nums = { 1, 1, 1 };
        new Solution().moveZeroes(nums);

        int[] expected = { 1, 1, 1 };

        assertArrayEquals(expected, nums);
    }

    @Test
    public void test_6() {

        int[] nums = { 0, 0, 0, 1 };
        new Solution().moveZeroes(nums);

        int[] expected = { 1, 0, 0, 0 };

        assertArrayEquals(expected, nums);
    }
    
}
