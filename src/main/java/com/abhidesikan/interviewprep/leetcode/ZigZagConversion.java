package com.abhidesikan.interviewprep.leetcode;

/**
 * Created by abhidesikan on 5/24/17.
 */
public class ZigZagConversion {
	public static String convert(String s, int nRows) {
		char[] c = s.toCharArray();
		int len = c.length;
		StringBuffer[] sb = new StringBuffer[nRows];
		for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();

		int i = 0;
		while (i < len) {
			for (int idx = 0; idx < nRows && i < len; idx++) {
				System.out.println(idx + " " + i + " " + c[i] + " vertical");
				sb[idx].append(c[i++]);
			}
			for (int idx = nRows - 2; idx >= 1 && i < len; idx--) {
				System.out.println(idx + " " + i + " " + c[i] + " oblique");
				sb[idx].append(c[i++]);
			}
		}
		System.out.println(sb[0]);
		System.out.println(sb[1]);
		System.out.println(sb[2]);
		for (int idx = 1; idx < sb.length; idx++) {
			System.out.println(idx + " " + sb.length + " " + sb[idx] + " final");
			sb[0].append(sb[idx]);
		}
		return sb[0].toString();
	}

	public static void main(String[] args) {
		System.out.println(convert("paypalishiring", 3));
	}
}
