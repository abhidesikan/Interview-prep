package com.abhidesikan.interviewprep.leetcode;

public class MinimumEditDistance {

	public static int minDistance(String word1, String word2) {

		int m = word1.length();
		int n = word2.length();

		int[][] cost = new int[m + 1][n + 1];

		for (int i = 0; i <= m; i++) {
			cost[i][0] = i;
		}
		for (int i = 1; i <= n; i++) {
			cost[0][i] = i;
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (word1.charAt(i) == word2.charAt(j)) {
					cost[i + 1][j + 1] = cost[i][j];
				} else {
					cost[i + 1][j + 1] = Math.min(cost[i][j], Math.min(cost[i + 1][j], cost[i][j + 1])) + 1;
				}
			}
		}
		return cost[m][n];
	}

	public static void main(String[] args) {
		System.out.println(minDistance("abhishek", "ashley"));
	}
}
