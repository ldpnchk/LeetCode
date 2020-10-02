package com.leetcode.easy.single_number;

import java.util.HashSet;
import java.util.Set;

/**
 * Single Number
 *
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */

public class Solution {

    public int singleNumber(int[] nums) {

        Set<Integer> appearedOnce = new HashSet<>();

        for (int num : nums) {
            if (!appearedOnce.contains(num)) {
                appearedOnce.add(num);
            } else {
                appearedOnce.remove(num);
            }
        }

        return appearedOnce.iterator().next();
    }

}
