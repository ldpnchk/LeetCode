package com.leetcode.easy.valid_anagram;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test_1() {

        String s = "anagram", t = "nagaram";
        boolean actual = new Solution().isAnagram(s, t);

        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {

        String s = "rat", t = "car";
        boolean actual = new Solution().isAnagram(s, t);

        boolean expected = false;

        assertEquals(expected, actual);
    }

}
