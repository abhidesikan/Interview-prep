package com.abhidesikan.interviewprep.leetcode;

public class MinPathSum {

	public static int minPathSum(int[][] grid) {

		int m = grid.length;
		int n = grid[0].length;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 && j == 0) {
					grid[i][j] = grid[i][j];
				} else if (i != 0 && j == 0) {
					grid[i][j] += grid[i - 1][j];
				} else if (j != 0 && i == 0) {
					grid[i][j] += grid[i][j - 1];
				} else {
					grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
				}
			}
		}

		return grid[m - 1][n - 1];
	}

	public static void main(String[] args) {
		System.out.println(minPathSum(new int[][]{{1,3,1}, {1,5,1}, {4,2,1}}));
	}
}
