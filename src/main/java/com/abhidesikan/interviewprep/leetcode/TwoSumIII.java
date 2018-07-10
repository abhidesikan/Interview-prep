package com.abhidesikan.interviewprep.leetcode;

import java.util.HashMap;

public class TwoSumIII {

	static HashMap<Integer, Integer> map;
	public TwoSumIII() {
		map = new HashMap<>();

	}

	/** Add the number to an internal data structure.. */
	public static void add(int number) {
		map.put(number, map.getOrDefault(number, 0) + 1);
	}

	/** Find if there exists any pair of numbers which sum is equal to the value. */
	public static boolean find(int value) {

		for(Integer val1 : map.keySet()) {
			Integer val2 = value - val1;
			if(val1 == val2 && map.get(val1) > 1 || val1 != val2 && map.containsKey(val2)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		TwoSumIII sumIII = new TwoSumIII();
		sumIII.add(2);
		sumIII.add(5);
		System.out.println(sumIII.find(7));
	}
}
