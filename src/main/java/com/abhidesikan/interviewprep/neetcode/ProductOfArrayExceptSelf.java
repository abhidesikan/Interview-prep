package com.abhidesikan.interviewprep.neetcode;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {

        //1, 2, 3, 4
        int[] result = new int[nums.length];

        int prefix = 1;

        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix = prefix * nums[i];
        }
        int postfix = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * postfix;
            postfix = postfix * nums[i];
        }
        return result;
    }
}
