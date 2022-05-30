package com.abhidesikan.interviewprep.neetcode;

import java.util.Collections;
import java.util.HashMap;

public class LongestRepeatingCharReplacement {

    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> countMap = new HashMap<>();

        int left = 0, right = 0;
        int result = 0;

        while (right < s.length()) {
            countMap.put(s.charAt(right), countMap.getOrDefault(s.charAt(right), 0) + 1);

            if ((right - left + 1) - Collections.max(countMap.values()) > k) {
                countMap.put(s.charAt(left), countMap.get(s.charAt(left)) - 1);
                left++;
            }
            result = Math.max(result, right - left + 1);
            right++;
        }
        return result;
    }
}
