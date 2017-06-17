package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;

/**
 * Created by abhidesikan on 6/14/17.
 */
public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {

		if (strs == null) {
			return null;
		}
		if (strs.length == 0) {
			return "";
		}

		Arrays.sort(strs);

		char first[] = strs[0].toCharArray();
		char last[] = strs[strs.length - 1].toCharArray();


		int i = 0, len = Math.min(first.length, last.length);

		System.out.println(len);
		while (i < len && first[i] == last[i]) {
			System.out.println(i);
			i++;
		}
		return strs[0].substring(0, i);
	}

	public static void main(String[] args) {
		String[] arr = {"aaa", "aa", "aaa"};
		System.out.println(longestCommonPrefix(arr));
	}
}
