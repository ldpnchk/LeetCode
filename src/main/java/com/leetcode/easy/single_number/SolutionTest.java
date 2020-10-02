package com.leetcode.easy.single_number;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test_1() {

        int[] nums = { 2, 2, 1 };
        int actual = new Solution().singleNumber(nums);

        int expected = 1;

        assertEquals(expected , actual);
    }

    @Test
    public void test_2() {

        int[] nums = { 4, 1, 2, 1, 2 };
        int actual = new Solution().singleNumber(nums);

        int expected = 4;

        assertEquals(expected , actual);
    }

    @Test
    public void test_3() {

        int[] nums = { 1 };
        int actual = new Solution().singleNumber(nums);

        int expected = 1;

        assertEquals(expected , actual);
    }

}
