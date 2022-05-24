package com.abhidesikan.interviewprep.neetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String originalWord = strs[i];
            char[] unsortedArray = originalWord.toCharArray();
            Arrays.sort(unsortedArray);
            String sortedWord = new String(unsortedArray);

            if (map.containsKey(sortedWord)) {
                map.get(sortedWord).add(originalWord);
            } else {
                List<String> list = new ArrayList<>();
                list.add(originalWord);
                map.put(sortedWord, list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
