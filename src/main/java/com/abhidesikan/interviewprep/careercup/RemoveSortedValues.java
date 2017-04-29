package com.abhidesikan.interviewprep.careercup;

import java.util.Arrays;

/**
 * Created by abhidesikan on 4/25/17.
 */
public class RemoveSortedValues {

    public static void removeValue(int arr[], int m) {
        int size = arr.length;

        int cur = 0;
        int cur_ele = -1;
        int count = 0;

        for(int i=0; i<size; i++) {
            System.out.println(cur_ele + " cur_ele " + i);
            if(cur_ele != arr[i]) {
                cur_ele = arr[i];
                count = 0;
            }
            if(cur_ele == arr[i] && count < Math.min(m, 2)) {
                System.out.println(" in here");
                count++;
                arr[cur] = arr[i];
                cur++;
            }
        }

        for(int i=cur; i<size; i++) {
            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String args[]) {
        int [] arr = {2,2,2,2,3};
        removeValue(arr, 2);
    }
}
