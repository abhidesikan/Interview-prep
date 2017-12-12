package com.abhidesikan.interviewprep.leetcode;

public class UniquePaths {


	static int paths = 0;

	public static int uniquePaths(int m, int n) {

		int x = 1, y = 1;

		if(x == m && y == n) {
			return paths;
		}

		return uniquePaths(m, n,x+1, y, paths) + uniquePaths(m,n,x,y+1, paths);
	}

	public static int uniquePaths(int m, int n, int x, int y, int paths) {
		int left = 0;
		int right = 0;
		if(x == m && y == n) {
			return paths++;
		}

		if(x > m || y > n) {
			return paths;
		}

		if(x < m) {
			left =  uniquePaths(m,n,x+1,y, paths);
		}

		if(y < n) {
			right =  uniquePaths(m,n,x,y+1, paths);
		}

		return left + right;

	}

	public static void main(String[] args) {
		System.out.println(uniquePaths(1, 2));
	}
}
