package com.leetcode.aa_array.a_easy;

import java.util.Arrays;

public class adRemoveElement {

    public static int removeElement(int[] nums, int val) {
        int p1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[p1] = nums[i];
                p1++;
            }
        }
        for (int i = p1; i < nums.length; i++) {
            nums[i] = 0;
        }
        return p1;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        //Output: 2, nums = [2,2,_,_]
        System.out.println(removeElement(nums, val));

        System.out.println(Arrays.toString(nums));
    }
}
