package com.abhidesikan.interviewprep.neetcode;

public class BinarySearch {

    public int search(int[] nums, int target) {

        if (nums == null || nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            System.out.println(left);
            System.out.println(right);
            int mid = (left + right) / 2;
            System.out.println("mid " + mid);
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};

        int result = new BinarySearch().search(arr, 9);
        System.out.println(result);
    }
}
