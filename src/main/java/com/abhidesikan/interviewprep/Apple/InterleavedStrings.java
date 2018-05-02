package com.abhidesikan.interviewprep.Apple;

import java.util.HashMap;
import java.util.Map;

public class InterleavedStrings {

	public static boolean isInterleave(String s1, String s2, String s3) {
		return (s1.length() + s2.length() == s3.length() && isInterleave(s1, 0, s2, 0, s3, 0, new HashMap<>()));
	}

	private static boolean isInterleave(String s1, int i, String s2, int j, String s3, int k, Map<String, Boolean> memo) {
		if (k == s3.length()) return true;
		String key = i + "," + j + "," + k;
		if (memo.containsKey(key)) return memo.get(key);

		boolean res = (i < s1.length() && s1.charAt(i) == s3.charAt(k) && isInterleave(s1, i+1, s2, j, s3, k+1, memo)) ||
				(j < s2.length() && s2.charAt(j) == s3.charAt(k) && isInterleave(s1, i, s2, j+1, s3, k+1, memo));
		memo.put(key, res);
		return res;
	}

	public static void main(String[] args) {
		System.out.println(isInterleave("ABC", "AAC", "AACABC"));
	}
}
