package com.abhidesikan.interviewprep.leetcode;

public class UniquePaths {


	static int paths = 0;

	public static int uniquePaths(int m, int n) {

		int [][] dp = new int[m][n];
		dp[0][0] = 1;

		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(i > 0 || j > 0) {
					dp[i][j] = (i > 0 ? dp[i-1][j] : 0 ) + (j > 0 ? dp[i][j-1] : 0);
				}
			}
		}
		return dp[m-1][n-1];
	}

	public static void main(String[] args) {
		System.out.println(uniquePaths(3, 2));
	}
}
