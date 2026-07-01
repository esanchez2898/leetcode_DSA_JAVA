package com.leetcode.aa_array.a_easy;

import java.util.*;

public class ajUniqueNumberOccurrences {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1,2,2,1,3};
        boolean r = s.uniqueOccurrences(arr);
        System.out.println(r);
    }
}


class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : arr) {
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }

        Set<Integer> valores = new HashSet<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            valores.add(entry.getValue());
        }

        return valores.size() == map.size();
    }
}
