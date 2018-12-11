package com.abhidesikan.interviewprep.leetcode;

public class MaxAreaOfIsland {

	public static int maxAreaOfIsland(int[][] grid) {

		if(grid.length == 0) {
			return 0;
		}

		int max = Integer.MIN_VALUE;
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[0].length; j++) {
				if(grid[i][j] == 1) {
					int curSum = findArea(grid, i, j);
					if(curSum > max) {
						max = curSum;
					}
				}
			}
		}
		return max == Integer.MIN_VALUE? 0 : max;
	}

	public static int findArea(int [][] grid, int i, int j) {

		if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 || grid[i][j] == -1) {
			return 0;
		}
		int sum = 1;
		grid[i][j] = -1;
		for(int k=-1; k < 2; k++) {
			for(int l=-1; l<2; l++) {
				if(k == l || k == -l) {
					continue;
				}
				sum += findArea(grid, i+k, j+l);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(maxAreaOfIsland(new int[][]{{1,0,0,1}, {1,0,0,1}}));
	}
}
