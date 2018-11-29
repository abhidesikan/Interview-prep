package com.abhidesikan.interviewprep.leetcode;

import java.util.HashSet;
import java.util.Set;

public class NumberOfDistinctIslands {

	public static int numDistinctIslands(int[][] grid) {

		Set<String> shapes = new HashSet<>();

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					StringBuilder sb = new StringBuilder();
					dfs(i, j, grid, sb, "o");
					shapes.add(sb.toString());
					grid[i][j] = 0;
				}
			}
		}
		return shapes.size();
	}

	public static void dfs(int i, int j, int[][] grid, StringBuilder sb, String dir) {
		if (i < 0 || j < 0 || i > grid.length - 1 || j > grid[0].length - 1 || grid[i][j] == 0) {
			return;
		}
		sb.append(dir);
		grid[i][j] = 0;
		dfs(i + 1, j, grid, sb, "d");
		dfs(i - 1, j, grid, sb, "u");
		dfs(i, j + 1, grid, sb, "r");
		dfs(i, j - 1, grid, sb, "l");
		sb.append("b");
	}

	public static void main(String[] args) {
		System.out.println(numDistinctIslands(new int[][]{{1,0,0,1}, {0,0,0,0}, {0,0,0,0}, {1,1,1,1}}));
	}
}
