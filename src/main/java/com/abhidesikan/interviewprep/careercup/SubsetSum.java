package com.abhidesikan.interviewprep.careercup;

/**
 * Created by abhidesikan on 4/29/17.
 */
public class SubsetSum {

	public static boolean checkSubsetSum(int a[], int n, int sum) {

		if(sum == 0) {
			return true;
		}
		if(n == 0 && sum != 0) {
			return false;
		}
		if(sum > a[n-1]) {
			checkSubsetSum(a, n-1, sum);
		}
		return checkSubsetSum(a, n-1, sum) || checkSubsetSum(a, n-1, sum-a[n-1]);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 3};
		System.out.println(checkSubsetSum(arr, arr.length, 20));
	}
}
