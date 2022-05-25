package com.abhidesikan.interviewprep.neetcode;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {

        HashSet<Integer> numSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            numSet.add(nums[i]);
        }
        int longest = 0;

        for (Integer num : numSet) {
            if (!numSet.contains(num - 1)) {
                int length = 1;

                while (numSet.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
