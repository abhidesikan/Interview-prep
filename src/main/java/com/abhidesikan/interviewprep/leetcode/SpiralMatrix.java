package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList();

		int maxRows = matrix.length;
		if (maxRows == 0) {
			return list;
		}

		int maxColumns = matrix[0].length;

		int row = 0;
		int column = 0;

		while (row < maxRows && column < maxColumns) {

			//print first row of remaining rows
			for (int i = column; i < maxColumns; i++) {
				list.add(matrix[row][i]);
			}
			row++;

			//print last of remaining columns
			for (int i = row; i < maxRows; i++) {
				list.add(matrix[i][maxColumns - 1]);
			}
			maxColumns--;

			//print last of remaining rows
			if (row < maxRows) {
				for (int i = maxColumns - 1; i >= column; i--) {
					list.add(matrix[maxRows - 1][i]);
				}
				maxRows--;
			}

			//print first of remaining columns
			if (column < maxColumns) {
				for (int i = maxRows - 1; i >= row; i--) {
					list.add(matrix[i][column]);
				}
				column++;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		System.out.println(spiralOrder(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}}));
	}
}
