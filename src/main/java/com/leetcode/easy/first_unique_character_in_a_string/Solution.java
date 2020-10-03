package com.leetcode.easy.first_unique_character_in_a_string;

import java.util.*;

/**
 * First Unique Character in a String
 *
 * Given a string, find the first non-repeating character in it and return its index.
 * If it doesn't exist, return -1.
 *
 * Note: You may assume the string contains only lowercase English letters.
 */

public class Solution {

    public int firstUniqChar(String s) {

        Map<Character, Integer> appearedOnce = new LinkedHashMap<>();
        Set<Character> appearedMoreThanOnce = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (!appearedMoreThanOnce.contains(s.charAt(i))) {
                if (appearedOnce.containsKey(s.charAt(i))) {
                    appearedOnce.remove(s.charAt(i));
                    appearedMoreThanOnce.add(s.charAt(i));
                } else {
                    appearedOnce.put(s.charAt(i), i);
                }
            }
        }

        if (appearedOnce.keySet().iterator().hasNext()) {
            return appearedOnce.get(appearedOnce.keySet().iterator().next());
        } else {
            return -1;
        }
    }

}
