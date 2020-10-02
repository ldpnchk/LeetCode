package com.leetcode.easy.rotate_array;

/**
 * Rotate Array
 *
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * Follow up:
 * Try to come up as many solutions as you can,
 * there are at least 3 different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 *
 * Constraints:
 * 1 <= nums.length <= 2 * 10^4
 * It's guaranteed that nums[i] fits in a 32 bit-signed integer.
 * k >= 0
 *
 * Hint 1:
 * The easiest solution would use additional memory and that is perfectly fine
 *
 * Hint #2
 * The actual trick comes when trying to solve this problem without using any additional memory.
 * This means you need to use the original array somehow to move the elements around.
 * Now, we can place each element in its original location and shift all the elements around it
 * to adjust as that would be too costly and most likely will time out on larger input arrays.
 *
 * Hint #3
 * One line of thought is based on reversing the array (or parts of it) to obtain the desired result.
 * Think about how reversal might potentially help us out by using an example.
 *
 * Hint #4
 * The other line of thought is a tad bit complicated but essentially it builds on the idea of placing
 * each element in its original position while keeping track of the element originally in that position.
 * Basically, at every step, we place an element in its rightful position and keep track
 * of the element already there or the one being overwritten in an additional variable.
 * can't do this in one linear pass and the idea here is based on cyclic-dependencies between elements.
 */

public class Solution {

    public void rotate(int[] nums, int k) {

        while (k > 0) {

            int lastElement = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = lastElement;

            k--;
        }
    }

}
