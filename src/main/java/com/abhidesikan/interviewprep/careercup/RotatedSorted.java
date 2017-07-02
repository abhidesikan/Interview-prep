package com.abhidesikan.interviewprep.careercup;

/**
 * Created by abhidesikan on 4/24/17.
 */
public class RotatedSorted {

    public static int searchValue(int arr[], int target) {

        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            int mid = left + (right-left)/2;
            System.out.println(arr[mid]);
            if(arr[mid] == target) {
                return mid;
            }
            if(arr[left] <= arr[mid]) {
                if (arr[left] <= target && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (arr[mid] < target && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main (String args[]) {
        int arr[] = {9, 11, 1, 2, 5, 7, 8};
        int pos = searchValue(arr, 1);
        System.out.println(pos);
    }
}
