package com.abhidesikan.interviewprep.leetcode;

public class ExcelTileToNumber {

	public static int titleToNumber(String s) {
		int result = 0;
		int position = 0;
		for(int i=s.length()-1; i>=0; i--) {
			result += Math.pow(26, position) * (s.charAt(i) - 'A' + 1);
			position++;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(titleToNumber("AAAA"));
	}
}
