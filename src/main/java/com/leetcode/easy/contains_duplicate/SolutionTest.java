package com.leetcode.easy.contains_duplicate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test_1() {

        int[] nums = { 1, 2, 3, 1 };
        boolean actual = new Solution().containsDuplicate(nums);

        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {

        int[] nums = { 1, 2, 3, 4 };
        boolean actual = new Solution().containsDuplicate(nums);

        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    public void test_3() {

        int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        boolean actual = new Solution().containsDuplicate(nums);

        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void test_4() {

        int[] nums = { 1 };
        boolean actual = new Solution().containsDuplicate(nums);

        boolean expected = false;

        assertEquals(expected, actual);
    }

}
