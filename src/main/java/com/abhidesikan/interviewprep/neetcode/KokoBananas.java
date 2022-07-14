package com.abhidesikan.interviewprep.neetcode;

public class KokoBananas {
    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = findMax(piles);

        int result = right;

        while (left <= right) {
            int mid = (left + right) / 2;
            
            long hours = count(piles, mid);

            if (hours <= h) {
                result = Math.min(result, mid);
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    private static long count(int[] arr, int num) {
        long res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += (arr[i] / num) + (arr[i] % num == 0 ? 0 : 1);
        }
        return res;
    }

    private int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 11};
        new KokoBananas().minEatingSpeed(arr, 8);
    }
}
