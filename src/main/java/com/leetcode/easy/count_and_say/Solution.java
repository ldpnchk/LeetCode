package com.leetcode.easy.count_and_say;

/**
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 *
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 *
 * Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
 * You can do so recursively, in other words from the previous member read off the digits,
 * counting the number of digits in groups of the same digit.
 *
 * Note: Each term of the sequence of integers will be represented as a string.
 *
 * Hint 1:
 * The following are the terms from n=1 to n=10 of the count-and-say sequence:
 *  1.     1
 *  2.     11
 *  3.     21
 *  4.     1211
 *  5.     111221
 *  6.     312211
 *  7.     13112221
 *  8.     1113213211
 *  9.     31131211131221
 * 10.     13211311123113112211
 *
 * Hint 2:
 * To generate the nth term, just count and say the n-1th term.
 */

public class Solution {

    public String countAndSay(int n) {

        if (n == 1) {
            return "1";
        }

        return count(countAndSay(n - 1));
    }

    private String count(String s) {

        StringBuilder stringBuilder = new StringBuilder();

        char currentIndex = 0;
        while (currentIndex < s.length()) {
            char currentCharacter = s.charAt(currentIndex);
            int currentCharacterCounter = 0;

            while (currentIndex < s.length() && s.charAt(currentIndex) == currentCharacter) {
                currentCharacterCounter++;
                currentIndex++;
            }
            stringBuilder.append(currentCharacterCounter);
            stringBuilder.append(currentCharacter);
        }

        return stringBuilder.toString();
    }

}
