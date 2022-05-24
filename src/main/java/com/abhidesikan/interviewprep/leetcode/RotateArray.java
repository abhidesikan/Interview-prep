package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
        reverse(nums, 0, k - 1);
        System.out.println(Arrays.toString(nums));
        reverse(nums, k, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        rotate(new int[]{2, 5, 3, 6, 7}, 2);
    }
}
