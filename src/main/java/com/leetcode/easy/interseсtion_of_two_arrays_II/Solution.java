package com.leetcode.easy.interseсtion_of_two_arrays_II;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Intersection of Two Arrays II
 *
 * Given two arrays, write a function to compute their intersection.
 *
 * Note:
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 *
 * Follow up:
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited
 * such that you cannot load all elements into the memory at once?
 */

public class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> firstArrayCounter = new HashMap<>();
        for (int num : nums1) {
            firstArrayCounter.put(num, firstArrayCounter.containsKey(num)
                    ? firstArrayCounter.get(num) + 1
                    : 1);
        }

        List<Integer> intersection = new ArrayList<>();
        for (int num : nums2) {
            if (firstArrayCounter.containsKey(num) && firstArrayCounter.get(num) > 0) {
                firstArrayCounter.put(num, firstArrayCounter.get(num) - 1);
                intersection.add(num);
            }
        }

        return toArray(intersection);
    }

    private int[] toArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

}
