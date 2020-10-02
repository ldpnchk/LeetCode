package com.leetcode.easy.remove_duplicates_from_sorted_array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test_1() {

        int[] nums = { 1, 1, 2 };
        int actual = new Solution().removeDuplicates(nums);

        int expected = 2;
        int[] expectedArray = { 1, 2, 2 };

        assertEquals(expected, actual);
        assertArrayEquals(expectedArray, nums);
    }

    @Test
    public void test_2() {

        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int actual = new Solution().removeDuplicates(nums);

        int expected = 5;
        int[] expectedArray = { 0, 1, 2, 3, 4, 2, 2, 3, 3, 4 };

        assertEquals(expected, actual);
        assertArrayEquals(expectedArray, nums);
    }

    @Test
    public void test_3() {

        int[] nums = { 1 };
        int actual = new Solution().removeDuplicates(nums);

        int expected = 1;
        int[] expectedArray = { 1 };

        assertEquals(expected, actual);
        assertArrayEquals(expectedArray, nums);
    }

    @Test
    public void test_4() {

        int[] nums = {1, 1, 1};
        int actual = new Solution().removeDuplicates(nums);

        int expected = 1;
        int[] expectedArray = { 1, 1, 1 };

        assertEquals(expected, actual);
        assertArrayEquals(expectedArray, nums);
    }

}
