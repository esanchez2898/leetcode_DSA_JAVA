package com.leetcode.aa_array.a_easy;

import java.util.*;

public class aiFindCommonCharacters {

    public static List<String> commonChars(String[] words) {

        List<Map<Character, Integer>> charCountList = new ArrayList<>();
        List<String> result = new ArrayList<>();

        // Build a character frequency map for each word
        for (String word : words) {

            Map<Character, Integer> charCount = new HashMap<>();
            for (int i = 0; i < word.length(); i++) {

                if (charCount.containsKey(word.charAt(i))) {
                    charCount.put(word.charAt(i), charCount.get(word.charAt(i)) + 1);
                } else {
                    charCount.put(word.charAt(i), 1);
                }

            }
//            System.out.println(charCount);
            charCountList.add(charCount);
        }
//        System.out.println(charCountList);



        // For each letter a-z, find the minimum count across all words
        for (char c = 'a'; c <= 'z'; c++) { // from a to z
            int min = Integer.MAX_VALUE;
            for (Map<Character, Integer> charCount : charCountList) { // each word
                if (charCount.getOrDefault(c, 0) < min) {
                    min = charCount.getOrDefault(c, 0);
                }
            }
            // Add the letter 'min' times to the result
            if (min > 0) {
                for (int i = 0; i < min; i++) {
                    result.add(String.valueOf(c));
                }
            }

        }

        return result;
    }

    public static void main(String[] args) {
        String[] words = new String[]{"cool", "lock", "cook"};
        System.out.println(commonChars(words));
    }
}