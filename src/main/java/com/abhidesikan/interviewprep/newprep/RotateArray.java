package com.abhidesikan.interviewprep.newprep;

import java.util.Arrays;

public class RotateArray {

    public static void rotateArray(int[] arr, int d, int n) {
        int[] arr2 = new int[n];

        int k = 0;
        for (int i = d; i < n; i++) {
            arr2[k] = arr[i];
            k++;
        }
        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < d; i++) {
            arr2[k] = arr[i];
            k++;
        }
        System.out.println(Arrays.toString(arr2));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 5, 6};
        RotateArray.rotateArray(arr, 2, arr.length);
    }
}
