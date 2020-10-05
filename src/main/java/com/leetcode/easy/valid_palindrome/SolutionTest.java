package com.leetcode.easy.valid_palindrome;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test_1() {

        String s = "A man, a plan, a canal: Panama";
        boolean actual = new Solution().isPalindrome(s);

        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {

        String s = "race a car";
        boolean actual = new Solution().isPalindrome(s);

        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    public void test_3() {

        String s = "a";
        boolean actual = new Solution().isPalindrome(s);

        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void test_4() {

        String s = ".,";
        boolean actual = new Solution().isPalindrome(s);

        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void test_5() {

        String s = "";
        boolean actual = new Solution().isPalindrome(s);

        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void test_6() {

        String s = "0P";
        boolean actual = new Solution().isPalindrome(s);

        boolean expected = false;

        assertEquals(expected, actual);
    }

}
