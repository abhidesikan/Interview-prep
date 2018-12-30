package com.abhidesikan.interviewprep.leetcode;

public class MaxKilledEnemies {

	public int maxKilledEnemies(char[][] grid) {

		if(grid.length == 0) {
			return 0;
		}
		int m = grid.length, n = grid[0].length;
		int rowCount = 0;
		int [] colCount = new int[n];
		int max = 0;
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(j == 0 || grid[i][j-1] == 'W') {
					rowCount = 0;
					for(int k=j; k<n && grid[i][k] != 'W'; k++) {
						if(grid[i][k] == 'E') {
							rowCount += grid[i][k] == 'E' ? 1 : 0;
						}
					}
				}

				if(i == 0 || grid[i-1][j] == 'W') {
					colCount[j] = 0;
					for(int k=i; k<m && grid[k][j] != 'W'; k++) {
						if(grid[k][j] == 'E') {
							colCount[j] += grid[k][j]== 'E' ? 1 : 0;
						}
					}
				}

				if(grid[i][j] == '0') {
					max = Math.max(max, rowCount + colCount[j]);
				}
			}
		}
		return max;
	}
}
