package com.leetcode.easy.longest_common_prefix;

/**
 * Longest Common Prefix
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Constraints:
 * 0 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lower-case English letters.
 */

public class Solution {

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0 || strs[0].length() == 0) {
            return "";
        }

        int prefixLength = strs[0].length();

        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() == 0) {
                return "";
            }

            if (prefixLength > strs[i].length()) {
                prefixLength = strs[i].length();
            }

            for (int j = 0; j < prefixLength; j++) {
                if (strs[i].charAt(j) != strs[0].charAt(j)) {
                    prefixLength = j;
                }
            }

            if (prefixLength == 0) {
                return "";
            }
        }

        return strs[0].substring(0, prefixLength);
    }

}
