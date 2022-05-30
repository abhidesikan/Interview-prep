package com.abhidesikan.interviewprep.neetcode;

import java.util.HashSet;

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int right = 0;
        HashSet<Character> window = new HashSet<>();
        int length = 0;
        while (right < s.length()) {
            if (!window.contains(s.charAt(right))) {
                window.add(s.charAt(right++));
                length = Math.max(window.size(), length);
            } else {
                window.remove(s.charAt(left++));
            }
        }
        return length;
    }
}
