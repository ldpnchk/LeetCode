package com.leetcode.easy.longest_common_prefix;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test_1() {

        String[] strs = { "flower", "flow", "flight" };
        String actual = new Solution().longestCommonPrefix(strs);

        String expected = "fl";

        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {

        String[] strs = { "dog", "racecar", "car" };
        String actual = new Solution().longestCommonPrefix(strs);

        String expected = "";

        assertEquals(expected, actual);
    }

}
