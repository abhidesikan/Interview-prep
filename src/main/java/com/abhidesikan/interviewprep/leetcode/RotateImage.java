package com.abhidesikan.interviewprep.leetcode;

public class RotateImage {
	public static void rotate(int[][] matrix) {
		int n=matrix.length;
		for (int i=0; i<n/2; i++)
			for (int j=i; j<n-i-1; j++) {
				System.out.println(i + " " + j);
				int tmp=matrix[i][j];
				matrix[i][j]=matrix[n-j-1][i];
				System.out.println(n-j-1);
				matrix[n-j-1][i]=matrix[n-i-1][n-j-1];
				matrix[n-i-1][n-j-1]=matrix[j][n-i-1];
				matrix[j][n-i-1]=tmp;
			}
	}

	public static void main(String[] args) {
		int arr[][] = new int[][] {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
		rotate(arr);
	}
}
