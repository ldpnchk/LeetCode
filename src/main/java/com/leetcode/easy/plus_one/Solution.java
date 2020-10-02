package com.leetcode.easy.plus_one;

/**
 * Plus one
 *
 * Given a non-empty array of digits representing a non-negative integer, increment one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list,
 * and each element in the array contains a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * Constraints:
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 */

public class Solution {

    public int[] plusOne(int[] digits) {

        boolean hasBePlussed = true;
        int currentIndex = digits.length - 1;
        while (hasBePlussed && currentIndex >= 0) {
            if (digits[currentIndex] < 9) {
                digits[currentIndex]++;
                hasBePlussed = false;
            } else {
                digits[currentIndex] = 0;
                currentIndex--;
            }
        }

        if (hasBePlussed) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                newDigits[i + 1] = digits[i];
            }

            return newDigits;
        }

        return digits;
    }

}
