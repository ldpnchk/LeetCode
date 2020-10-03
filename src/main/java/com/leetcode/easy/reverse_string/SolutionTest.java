package com.leetcode.easy.reverse_string;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    @Test
    public void test_1() {

        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        new Solution().reverseString(s);

        char[] expected = { 'o', 'l', 'l', 'e', 'h' };

        assertArrayEquals(expected, s);
    }

    @Test
    public void test_2() {

        char[] s = { 'H', 'a', 'n', 'n', 'a', 'h' };
        new Solution().reverseString(s);

        char[] expected = { 'h', 'a', 'n', 'n', 'a', 'H' };

        assertArrayEquals(expected, s);
    }

    @Test
    public void test_3() {

        char[] s = { 'a' };
        new Solution().reverseString(s);

        char[] expected = { 'a' };

        assertArrayEquals(expected, s);
    }

}
