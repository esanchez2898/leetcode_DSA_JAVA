package com.leetcode.aa_array.a_easy;

import java.util.Arrays;

public class abMergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = (m-1);
        int p2 = (n-1);
        int p = (m + n) - 1;

        for (int i = p; i >= 0; i--) {
            if(p2 < 0) {
                nums1[i] = nums1[p1];
                p1--;
                continue;
            } else if (p1 < 0) {
                nums1[i] = nums2[p2];
                p2--;
                continue;
            }
            if (nums1[p1] < nums2[p2]) {
                nums1[i] = nums2[p2];
                p2--;
            } else {
                nums1[i] = nums1[p1];
                p1--;
            }
        }
    }

}
