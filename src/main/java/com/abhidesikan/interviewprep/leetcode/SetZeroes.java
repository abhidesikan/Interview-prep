package com.abhidesikan.interviewprep.leetcode;

public class SetZeroes {
	public static void setZeroes(int[][] matrix) {
		int [] rows = new int[matrix.length];
		int [] col = new int[matrix[0].length];

		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					rows[i] = 1;
					col[j] = 1;
				}
			}
		}

		for(int i=0; i<rows.length; i++) {
			if(rows[i] == 1) {
				for(int j=0; j<matrix[0].length; j++) {
					matrix[i][j] = 0;
				}
			}
		}

		for(int j=0; j<col.length; j++) {
			if (col[j] == 1) {
				for (int i = 0; i < matrix.length; i++) {
					matrix[i][j] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		setZeroes(new int[][]{{1,2}, {3, 4}});
	}
}
