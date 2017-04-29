package com.abhidesikan.interviewprep.careercup;

/**
 * Created by abhidesikan on 4/25/17.
 */
public class Frequency {

    public static int findFirstOccurrence(int arr[], int target) {

        int low =0;
        int high = arr.length-1;
        int result = 0;
        while(low <= high) {
            int mid = (low+high)/2;
            if(target == arr[mid]) {
                result = mid;
                high = mid-1;
            } else if(target > arr[mid]){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return result;
    }

    public static int findLastOccurrence(int arr[], int target) {

        int low =0;
        int high = arr.length-1;
        int result = 0;
        while(low <= high) {
            int mid = (low+high)/2;
            if(target == arr[mid]) {
                result = mid;
                low = mid+1;
            } else if(target > arr[mid]){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return result;
    }

    public static int findTotalCount(int arr[], int target) {
        return findLastOccurrence(arr, target) - findFirstOccurrence(arr, target)+ 1;
    }

    public static void main(String args[]) {
        int arr[] = {1,1,1,1,1,2,2,2,2,3,3,3};
        System.out.println(findTotalCount(arr, 1));
    }
}
