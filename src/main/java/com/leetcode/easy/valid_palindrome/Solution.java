package com.leetcode.easy.valid_palindrome;

/**
 * Valid Palindrome
 *
 * Given a string, determine if it is a palindrome,
 * considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 * Constraints:
 * s consists only of printable ASCII characters.
 */

public class Solution {

    public boolean isPalindrome(String s) {

        int startIterator = 0;
        int endIterator = s.length() - 1;

        while (startIterator < endIterator) {
            while (startIterator < s.length() && !Character.isAlphabetic(s.charAt(startIterator))
                    && !Character.isDigit(s.charAt(startIterator))) {
                startIterator++;
            }
            while (endIterator >= 0 && !Character.isAlphabetic(s.charAt(endIterator))
                    && !Character.isDigit(s.charAt(endIterator))) {
                endIterator--;
            }

            if (startIterator >= endIterator) {
                break;
            }

            if (Character.toLowerCase(s.charAt(startIterator)) !=
                    Character.toLowerCase(s.charAt(endIterator))) {
                return false;
            }

            startIterator++;
            endIterator--;
        }

        return true;
    }

}
