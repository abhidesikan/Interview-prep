package com.abhidesikan.interviewprep.neetcode;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (indexMap.containsKey(diff)) {
                return new int[]{indexMap.get(diff), i};
            }
            indexMap.put(nums[i], i);
        }
        return null;
    }
}
