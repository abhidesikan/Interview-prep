package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GetFactors {
	public static List<List<Integer>> getFactors(int n) {

		List<List<Integer>> list = new ArrayList<>();
		helper(list, new ArrayList<Integer>(), n, 2);
		return list;
	}

	public static void helper(List<List<Integer>> list, List<Integer> temp, int n, int start) {
		if (n <= 1) {
			if (temp.size() > 1) {
				list.add(new ArrayList<Integer>(temp));
			}
			return;
		}

		for (int i = start; i <= n; i++) {
			if (n % i == 0) {
				temp.add(i);
				helper(list, temp, n / i, i);
				temp.remove(temp.size() - 1);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(getFactors(32));
	}
}
