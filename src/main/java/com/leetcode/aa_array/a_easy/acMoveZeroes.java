package com.leetcode.aa_array.a_easy;

import java.util.Arrays;

public class acMoveZeroes {
    public static void moveZeroes(int[] nums) {
        int p1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[p1] = nums[i];
                p1++;
            }
        }
        for (int i = (p1); i < nums.length ; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        //Output:    [1,3,12,0,0]
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
