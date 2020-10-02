package com.leetcode.easy.interseсtion_of_two_arrays_II;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    @Test
    public void test_1() {

        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        int[] actual = new Solution().intersect(nums1, nums2);

        int[] expected = { 2, 2 };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_2() {

        int[] nums1 = { 4, 9, 5 };
        int[] nums2 = { 9, 4, 9, 8, 4 };
        int[] actual = new Solution().intersect(nums1, nums2);

        int[] expected = { 9, 4 };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_3() {

        int[] nums1 = { 1, 2, 3};
        int[] nums2 = { 4, 5, 6 };
        int[] actual = new Solution().intersect(nums1, nums2);

        int[] expected = { };

        assertArrayEquals(expected, actual);
    }

}
