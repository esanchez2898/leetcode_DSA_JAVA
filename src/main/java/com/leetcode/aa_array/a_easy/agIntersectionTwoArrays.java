package com.leetcode.aa_array.a_easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class agIntersectionTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> unicos = new HashSet<>();
        Set<Integer> interseccion = new HashSet<>();


        for (int n : nums1) {
            unicos.add(n);
        }

        for (int n : nums2) {
            if(unicos.contains(n)) {
                interseccion.add(n);
            }
        }

        int[] inter = new int[interseccion.size()];
        int c = 0;

        for (int i : interseccion) {
            inter[c] = i;
            c++;
        }

        return inter;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}