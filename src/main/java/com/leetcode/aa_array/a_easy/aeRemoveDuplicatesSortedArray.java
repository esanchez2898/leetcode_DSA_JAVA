package com.leetcode.aa_array.a_easy;

import java.util.Arrays;

public class aeRemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] nums) {
        int slow = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[slow]) {
                slow++;
                nums[slow] = nums[i];
            }
        }
        for (int i = (slow + 1); i < nums.length; i++) {
            nums[i] = 0;
        }
        return (slow + 1);
    }
    public static void main(String[] args) {
//        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
