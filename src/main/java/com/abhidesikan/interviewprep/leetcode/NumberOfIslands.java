package com.abhidesikan.interviewprep.leetcode;

public class NumberOfIslands {

	public static int numIslands(char[][] grid) {
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '1') {
					checkAdjacent(i, j, grid);
					grid[i][j] = 'a';
					count++;
				}
			}
		}
		return count;
	}

	public static void checkAdjacent(int x, int y, char[][] grid) {

		if (grid[x][y] == '0') {
			return;
		}

		if (x + 1 < grid.length && grid[x + 1][y] == '1') {
			grid[x + 1][y] = 'a';
			checkAdjacent(x + 1, y, grid);
		}

		if (y + 1 < grid[0].length && grid[x][y + 1] == '1') {
			grid[x][y + 1] = 'a';
			checkAdjacent(x, y + 1, grid);
		}

		if (x - 1 >= 0 && grid[x - 1][y] == '1') {
			grid[x - 1][y] = 'a';
			checkAdjacent(x - 1, y, grid);
		}

		if (y - 1 >= 0 && grid[x][y - 1] == '1') {
			grid[x][y - 1] = 'a';
			checkAdjacent(x, y - 1, grid);
		}
	}

	public static void main(String[] args) {
		char[][] foo = new char[][]{
				new char[]{'1', '1', '0'},
				new char[]{'1', '1', '0'},
		};

		System.out.println(numIslands(foo));
	}
}
