package com.abhidesikan.interviewprep.leetcode;

public class RepeatedStringMatch {

	public static int repeatedStringMatch(String A, String B) {

		int count = 0;
		StringBuilder sb = new StringBuilder();

		while(sb.length () < B.length()) {
			sb.append(A);
			count++;
		}

		if(sb.toString().contains(B)) {
			return count;
		}

		if(sb.append(A).toString().contains(B)) {
			return ++count;
		}

		return -1;
	}

	public static void main(String[] args) {
		String A = "abc";
		String B = "bcabcabca";

		System.out.println(repeatedStringMatch(A,B));
	}

}
