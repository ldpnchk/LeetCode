package com.leetcode.easy.implement_str_str;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test_1() {

        String haystack = "hello", needle = "ll";
        int actual = new Solution().strStr(haystack, needle);

        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {

        String haystack = "aaaaa", needle = "bba";
        int actual = new Solution().strStr(haystack, needle);

        int expected = -1;

        assertEquals(expected, actual);
    }

    @Test
    public void test_3() {

        String haystack = "", needle = "";
        int actual = new Solution().strStr(haystack, needle);

        int expected = 0;

        assertEquals(expected, actual);
    }

}
