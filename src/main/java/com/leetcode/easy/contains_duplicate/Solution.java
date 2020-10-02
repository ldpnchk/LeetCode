package com.leetcode.easy.contains_duplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * Contains Duplicate
 *
 * Given an array of integers, find if the array contains any duplicates.
 *
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 */

public class Solution {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> appeared = new HashSet<>();

        for (int num : nums) {
            if (appeared.contains(num)) {
                return true;
            }
            appeared.add(num);
        }

        return false;
    }

}
