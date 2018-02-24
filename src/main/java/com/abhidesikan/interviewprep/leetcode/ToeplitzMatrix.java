package com.abhidesikan.interviewprep.leetcode;

public class ToeplitzMatrix {

	public static boolean isToeplitzMatrix(int[][] matrix) {
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				if(checkDiagonal(i, j, matrix) == false) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean checkDiagonal(int i, int j, int [][] matrix) {
		if(i == matrix.length-1 || j == matrix[0].length-1) {
			return true;
		}

		if(matrix[i+1][j+1] == matrix[i][j]) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		int arr[][] = new int[][]{{1,2,3,4},{5,1,2,3},{9,5,1,2}};
		System.out.println(isToeplitzMatrix(arr));
	}
}


