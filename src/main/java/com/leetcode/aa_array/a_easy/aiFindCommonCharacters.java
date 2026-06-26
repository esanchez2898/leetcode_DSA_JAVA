package com.leetcode.aa_array.a_easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class aiFindCommonCharacters {

    public static List<String> commonChars(String[] words) {

        List<Map<Character, Integer>> mapList = new ArrayList<>();

        for (String w : words) {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < w.length(); i++) {
                if (map.containsKey(w.charAt(i))) {
                    map.put(w.charAt(i), map.get(w.charAt(i)) + 1);
                } else {
                    map.put(w.charAt(i), 1);
                }
            }
            mapList.add(map);
        }

        System.out.println(mapList);


        for (int i = 1; i < mapList.size(); i++) {

        }



        return null;
    }

    public static void main(String[] args) {

        String[] words = new String[]{"bella", "label", "roller"};

        commonChars(words);
    }
}
