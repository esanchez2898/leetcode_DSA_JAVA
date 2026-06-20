package com.leetcode.aa_array.a_easy;

import java.util.Arrays;

public class afSquaresSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int[] numOrder = new int[nums.length];
        int l = 0;
        int r = (nums.length - 1);
        for (int i = nums.length - 1; i >= 0; i--) {
            if ((int) Math.pow(nums[r], 2) > (int) Math.pow(nums[l], 2)) {
                numOrder[i] = (int) Math.pow(nums[r], 2);
                r--;
            } else {
                numOrder[i] = (int) Math.pow(nums[l], 2);
                l++;
            }
        }
        return numOrder;
    }

    public static void main(String[] args) {
        int[] nums = {-5,-3,-2,-1};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

}
