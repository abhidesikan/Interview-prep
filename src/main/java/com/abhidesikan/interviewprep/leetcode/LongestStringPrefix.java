package com.abhidesikan.interviewprep.leetcode;

public class LongestStringPrefix {

	public static int longestPrefix(String s) {

		if (s.isEmpty() || s == "") {
			return 0;
		}

		int max = 0;
		int cur = 0;
		int last = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) >= last) {
				System.out.println("value " + (int)s.charAt(i));
				cur++;
				last = s.charAt(i);
			}
			if (max < cur) {
				max = cur;
			}
		}

		return max;
	}

	public static void main(String[] args) {
		System.out.println(longestPrefix("knotty"));
		System.out.println(longestPrefix("apple"));
		System.out.println(longestPrefix("excel"));
		System.out.println(longestPrefix(""));
	}
}
