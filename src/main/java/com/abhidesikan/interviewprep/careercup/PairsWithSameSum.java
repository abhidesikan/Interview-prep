package com.abhidesikan.interviewprep.careercup;

import java.util.Arrays;

/**
 * Created by abhidesikan on 4/26/17.
 */
public class PairsWithSameSum {

    public static void pairsWithSameSum(int arr1[], int arr2[], int n) {

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i =0, j = arr2.length-1;
        while(i<arr1.length || j>0) {
            int sum = arr1[i] + arr2[j];
            if(sum == n) {
                System.out.println(arr1[i] + " " + arr2[j]);
                i++;
            } else if(sum < n) {
                i++;
            } else {
                j--;
            }
        }
    }

    public static void main(String args[]) {
        int arr1[] = {4,5,2,3,6};
        int arr2[] = {-3, 0, 4, -1, 9};
        pairsWithSameSum(arr1, arr2, 3);
    }
}
