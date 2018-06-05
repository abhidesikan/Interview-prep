package com.abhidesikan.interviewprep.leetcode;

public class MaximalSquare {
	public static int maximalSquare(char[][] matrix) {
		int maxSize = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == '1') {
					int size = findMaxSquareSize(i, j, matrix, 1);
					maxSize = Math.max(size, maxSize);
				}
			}
		}
		return maxSize * maxSize;
	}

	public static int findMaxSquareSize(int i, int j, char[][] matrix, int size) {
		if ((i + size) >= matrix.length || (j + size) >= matrix[0].length) {
			return size;
		}

		if (matrix[i][j + size] == '0' || matrix[i + size][j] == '0' || matrix[i + size][j + size] == '0') {
			return size;
		}

		for (int k = j; k < j + size; k++) {
			if (matrix[size + i][k] != '1') {
				return size;
			}
		}

		for (int k = i; k < i + size; k++) {
			if (matrix[k][size + j] != '1') {
				return size;
			}
		}

		return findMaxSquareSize(i, j, matrix, size + 1);
	}

	public static void main(String[] args) {
		System.out.println(maximalSquare(new char[][]{{'1', '1', '1', '0'}, {'1', '1', '1', '0'}, {'1', '1', '1', '0'}, {'1', '1', '1', '0'}}));
	}
}
