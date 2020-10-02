package com.leetcode.easy.move_zeroes;

/**
 * Move Zeroes
 *
 * Given an array nums, write a function to move all 0's to the end of it
 * while maintaining the relative order of the non-zero elements.
 *
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 *
 * Hint 1:
 * In-place means we should not be allocating any space for extra array.
 * But we are allowed to modify the existing array.
 * However, as a first step, try coming up with a solution that makes use of additional space.
 * For this problem as well, first apply the idea discussed using an additional array
 * and the in-place solution will pop up eventually.
 *
 * Hint 2:
 * A two-pointer approach could be helpful here.
 * The idea would be to have one pointer for iterating the array and another pointer
 * that just works on the non-zero elements of the array.
 */

public class Solution {

    public void moveZeroes(int[] nums) {

        int nextNumberPosition = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == nextNumberPosition) {
                if (nums[nextNumberPosition] != 0) {
                    nextNumberPosition++;
                }
            } else if (nums[i] != 0) {
                nums[nextNumberPosition] = nums[i];
                nums[i] = 0;
                nextNumberPosition++;
            }
        }
    }

}
