package com.abhidesikan.interviewprep.hacckerrank;

import java.util.Arrays;

public class ServerAllocation {

	public static int nextServerNumber(int arr[]) {
		if (arr.length == 0) {
			return 1;
		}
		if (arr.length == 1 || arr[0] != 1) {
			if (arr[0] <= 1) {
				return 1 + arr[0];
			} else {
				return 1;
			}
		}

		Arrays.sort(arr);
		int prev = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - prev > 1) {
				return prev + 1;
			} else {
				prev = arr[i];
			}
		}
		return arr[arr.length - 1] + 1;
	}
}
