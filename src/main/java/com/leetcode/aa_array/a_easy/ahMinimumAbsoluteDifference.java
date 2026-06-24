package com.leetcode.aa_array.a_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ahMinimumAbsoluteDifference {

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {


        List<List<Integer>> mad = new ArrayList<>();

        Arrays.sort(arr);
        int min = arr[1] - arr[0];

        for (int i = 0; i < (arr.length - 1); i++) {
            if ((arr[i+1] - arr[i]) < min) {
                min = arr[i+1] - arr[i];
            }
        }

        for (int i = 0; i < (arr.length - 1); i++) {
            if ((arr[i+1] - arr[i]) == min) {
                List<Integer> madPar = new ArrayList<>();
                madPar.add(arr[i]);
                madPar.add(arr[i+1]);
                mad.add(madPar);
            }

        }

        return mad;
    }

    public static void main(String[] args) {
        int[] arr = {3,8,-10,23,19,-4,-14,27};
        System.out.println(minimumAbsDifference(arr));
    }
}
