package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DigitsMultiplyToNumber {

	public static int findSmallestNumber(int m) {

		if (m < 10) {
			return m;
		}

		List<Integer> list = new ArrayList<>();

		for (int i = 9; i > 1; i--) {
			while (m % i == 0) {
				m = m / i;
				list.add(i);
			}
		}

		if (m > 10) {
			return 0;
		}

		Collections.reverse(list);

		int result = 0;

		for (Integer i : list) {
			result = result * 10 + i;
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(findSmallestNumber(36));
		System.out.println(findSmallestNumber(72));
	}
}
