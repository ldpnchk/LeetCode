package com.leetcode.easy.string_to_integer_atoi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test_1() {

        String s = "42";
        int actual = new Solution().myAtoi(s);

        int expected = 42;

        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {

        String s = "   -42";
        int actual = new Solution().myAtoi(s);

        int expected = -42;

        assertEquals(expected, actual);
    }

    @Test
    public void test_3() {

        String s = "4193 with words";
        int actual = new Solution().myAtoi(s);

        int expected = 4193;

        assertEquals(expected, actual);
    }

    @Test
    public void test_4() {

        String s = "words and 987";
        int actual = new Solution().myAtoi(s);

        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void test_5() {

        String s = "-91283472332";
        int actual = new Solution().myAtoi(s);

        int expected = -2147483648;

        assertEquals(expected, actual);
    }

    @Test
    public void test_6() {

        String s = "";
        int actual = new Solution().myAtoi(s);

        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void test_7() {

        String s = " ";
        int actual = new Solution().myAtoi(s);

        int expected = 0;

        assertEquals(expected, actual);
    }

}
