package com.leetcode.easy.count_and_say;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test_1() {

        int n = 1;
        String actual = new Solution().countAndSay(n);

        String expected = "1";

        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {

        int n = 2;
        String actual = new Solution().countAndSay(n);

        String expected = "11";

        assertEquals(expected, actual);
    }

    @Test
    public void test_3() {

        int n = 3;
        String actual = new Solution().countAndSay(n);

        String expected = "21";

        assertEquals(expected, actual);
    }

    @Test
    public void test_4() {

        int n = 4;
        String actual = new Solution().countAndSay(n);

        String expected = "1211";

        assertEquals(expected, actual);
    }

    @Test
    public void test_5() {

        int n = 5;
        String actual = new Solution().countAndSay(n);

        String expected = "111221";

        assertEquals(expected, actual);
    }

    @Test
    public void test_6() {

        int n = 6;
        String actual = new Solution().countAndSay(n);

        String expected = "312211";

        assertEquals(expected, actual);
    }

    @Test
    public void test_7() {

        int n = 7;
        String actual = new Solution().countAndSay(n);

        String expected = "13112221";

        assertEquals(expected, actual);
    }

    @Test
    public void test_8() {

        int n = 8;
        String actual = new Solution().countAndSay(n);

        String expected = "1113213211";

        assertEquals(expected, actual);
    }

    @Test
    public void test_9() {

        int n = 9;
        String actual = new Solution().countAndSay(n);

        String expected = "31131211131221";

        assertEquals(expected, actual);
    }

    @Test
    public void test_10() {

        int n = 10;
        String actual = new Solution().countAndSay(n);

        String expected = "13211311123113112211";

        assertEquals(expected, actual);
    }

}
