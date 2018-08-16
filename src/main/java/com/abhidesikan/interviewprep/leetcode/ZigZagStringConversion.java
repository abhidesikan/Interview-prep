package com.abhidesikan.interviewprep.leetcode;

public class ZigZagStringConversion {

	public static String convert(String s, int numRows) {

		char arr[] = s.toCharArray();

		int len = s.length();

		StringBuffer[] sb = new StringBuffer[numRows];

		for (int i = 0; i < numRows; i++) {
			sb[i] = new StringBuffer();
		}

		int i = 0;

		while (i < len) {
			for (int j = 0; j < numRows && i < len; j++) {
				sb[j].append(arr[i++]);
			}
			for (int k = numRows - 2; k >= 1 && i < len; k--) {
				sb[k].append(arr[i++]);
			}
		}

		for (int l = 1; l < numRows; l++) {
			sb[0].append(sb[l]);
		}
		return sb[0].toString();
	}

	public static void main(String[] args) {
		System.out.println(convert("abhishekisawesome", 3));
	}
}
