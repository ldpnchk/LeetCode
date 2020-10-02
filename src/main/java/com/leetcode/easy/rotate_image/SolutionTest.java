package com.leetcode.easy.rotate_image;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    @Test
    public void test_1() {

        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        new Solution().rotate(matrix);

        int[][] expectedResult = {
                { 7, 4, 1 },
                { 8, 5, 2 },
                { 9, 6, 3 }
        };

        assertArrayEquals(expectedResult, matrix);
    }

    @Test
    public void test_2() {

        int[][] matrix = {
                { 5, 1, 9, 11 },
                { 2, 4, 8, 10 },
                { 13, 3, 6, 7 },
                { 15, 14, 12, 16 }
        };
        new Solution().rotate(matrix);

        int[][] expectedResult = {
                { 15, 13, 2, 5 },
                { 14, 3, 4, 1 },
                { 12, 6, 8, 9 },
                { 16, 7, 10, 11 }
        };

        assertArrayEquals(expectedResult, matrix);
    }

    @Test
    public void test_3() {

        int[][] matrix = {
                { 1 }
        };
        new Solution().rotate(matrix);

        int[][] expectedResult = {
                { 1 }
        };

        assertArrayEquals(expectedResult, matrix);
    }

}
