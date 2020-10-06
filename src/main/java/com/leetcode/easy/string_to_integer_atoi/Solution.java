package com.leetcode.easy.string_to_integer_atoi;

/**
 * String to Integer (atoi)
 *
 * Implement atoi which converts a string to an integer.
 *
 * The function first discards as many whitespace characters as necessary
 * until the first non-whitespace character is found.
 * Then, starting from this character takes an optional initial plus or minus sign
 * followed by as many numerical digits as possible, and interprets them as a numerical value.
 *
 * The string can contain additional characters after those that form the integral number,
 * which are ignored and have no effect on the behavior of this function.
 *
 * If the first sequence of non-whitespace characters in str is not a valid integral number,
 * or if no such sequence exists because either str is empty or it contains only whitespace characters,
 * no conversion is performed.
 *
 * If no valid conversion could be performed, a zero value is returned.
 *
 * Note:
 * Only the space character ' ' is considered a whitespace character.
 * Assume we are dealing with an environment that could only store integers
 * within the 32-bit signed integer range: [−231,  231 − 1].
 * If the numerical value is out of the range of representable values,
 * INT_MAX (231 − 1) or INT_MIN (−231) is returned.
 *
 * Constraints:
 * 0 <= s.length <= 200
 * s consists of English letters (lower-case and upper-case), digits, ' ', '+', '-' and '.'.
 */

public class Solution {

    public int myAtoi(String s) {

        int currentIndex = 0;
        while (currentIndex < s.length() && s.charAt(currentIndex) == ' ') {
            currentIndex++;
        }

        boolean isNegative = currentIndex < s.length() && s.charAt(currentIndex) == '-';

        if (currentIndex < s.length() &&
                (s.charAt(currentIndex) == '+' || s.charAt(currentIndex) == '-')) {
            currentIndex++;
        }

        long result = 0L;
        while (currentIndex < s.length() && Character.isDigit(s.charAt(currentIndex))) {

            int currentNumber = s.charAt(currentIndex) - '0';

            result = result * 10 + (isNegative
                    ? - currentNumber
                    : currentNumber);

            if (result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            currentIndex++;
        }

        return (int) result;
    }

}
