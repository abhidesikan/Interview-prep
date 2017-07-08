package com.abhidesikan.interviewprep.leetcode;

/**
 * Created by abhidesikan on 7/8/17.
 */
public class SearchInsertPos {

	public static int searchInsert(int nums[], int target) {
		int l=0; int r=nums.length-1;

		while(l<=r) {
			int mid = (l+r)/2;
			if(target == nums[mid]) {
				return mid;
			} else if (target < nums[mid]) {
				r = mid-1;
			} else {
				l = mid+1;
			}
		}
		return l;
	}

	public static void main(String[] args) {
		int arr[] = {1,3,5};
		System.out.println(searchInsert(arr, 4));
	}
}
