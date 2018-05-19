package com.abhidesikan.interviewprep.leetcode;

public class ValidSquare {

	public static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {

		long max = Long.MIN_VALUE;
		long nonMax = 0;
		long[] lengths = {findDistance(p1, p2), findDistance(p2, p3), findDistance(p3, p4),
				findDistance(p4, p1), findDistance(p1, p3), findDistance(p2, p4)};

		for (long length : lengths) {
			max = Math.max(length, max);
		}

		int count = 0;

		for (long length : lengths) {
			if (length == max) {
				count++;
			} else {
				nonMax = length;
			}
		}

		if (count != 2) {
			return false;
		}

		for (long length : lengths) {
			if (length != max && length != nonMax) {
				return false;
			}
		}
		return true;
	}


	public static long findDistance(int[] p1, int[] p2) {
		return (long) Math.pow(p1[0] - p2[0], 2) + (long) Math.pow(p1[1] - p2[1], 2);
	}

	public static void main(String[] args) {
		System.out.println(validSquare(new int[]{0, 0}, new int[]{0, 1}, new int[]{1, 1}, new int[]{1, 0}));
	}
}
