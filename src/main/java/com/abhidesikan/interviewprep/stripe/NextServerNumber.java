package com.abhidesikan.interviewprep.stripe;

import java.util.ArrayList;
import java.util.Arrays;

public class NextServerNumber {

	public static int nextServerNumber(int arr[]) {

		if(arr.length == 0) {
			return 1;
		}

		Arrays.sort(arr);

		ArrayList<Integer> values = new ArrayList();
		for(int i: arr) {
			if(i > 0) {
				values.add(i);
			}
		}

		if(values.isEmpty()) {
			return 1;
		}

		arr = values.stream().mapToInt(i -> i).toArray();

		if(arr.length == 1 || arr[0] != 1) {
			return 1;
		}

		int prev = arr[0];

		for(int i=1; i<arr.length; i++) {
			if(arr[i] - prev > 1) {
				return prev + 1;
			} else {
				prev = arr[i];
			}
		}

		return arr[arr.length-1] + 1;
	}
}
