package com.leetcode.easy.two_sum;

import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum
 *
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Constraints:
 * 2 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 *
 * Hint 1:
 * A really brute force way would be to search for all possible pairs of numbers but that would be too slow.
 * Again, it's best to try out brute force solutions for just for completeness.
 * It is from these brute force solutions that you can come up with optimizations.
 *
 * Hint 2:
 * So, if we fix one of the numbers, say x, we have to scan the entire array to find the next number y
 * which is (value - x) where value is the input parameter.
 * Can we change our array somehow so that this search becomes faster?
 *
 * Hint 3:
 * The second train of thought is, without changing the array, can we use additional space somehow?
 * Like maybe a hash map to speed up the search?
 */

public class Solution {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numsIndexes = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int residue = target - nums[i];
            if (numsIndexes.containsKey(residue)) {
                return new int[]{numsIndexes.get(residue), i};
            } else {
                numsIndexes.put(nums[i], i);
            }
        }

        return new int[]{};
    }

}
