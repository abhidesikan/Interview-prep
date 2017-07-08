package com.abhidesikan.interviewprep.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by abhidesikan on 7/8/17.
 */
public class ValidSudoku {

	public static boolean isValidSudoku(char[][] board) {

		Set<Integer> numSet = new HashSet<Integer>();

		//rows check
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == '.') {
					continue;
				}
				int num = Character.getNumericValue(board[i][j]);
				if (numSet.contains(num)) {
					System.out.println(num);
					return false;
				} else {
					numSet.add(num);
				}
			}
			numSet.clear();
		}

		//columns check
		for (int j = 0; j < board[0].length; j++) {
			for (int i = 0; i < board.length; i++) {
				if (board[i][j] == '.') {
					continue;
				}
				int num = Character.getNumericValue(board[i][j]);
				if (numSet.contains(num)) {
					return false;
				} else {
					numSet.add(num);
				}
			}
			numSet.clear();
		}

		//box check
		for (int m = 0; m < 3; m++) {
			for (int n = 0; n < 3; n++) {
				numSet.clear();
				for (int i = m * 3; i < m * 3 + 3; i++) {
					for (int j = n * 3; j < n * 3 + 3; j++) {
						System.out.println(i + " " + j);
						if (board[i][j] == '.') {
							continue;
						}
						int num = Character.getNumericValue(board[i][j]);
						if (numSet.contains(num)) {
							return false;
						} else {
							numSet.add(num);
						}
					}
				}
			}
		}

		return true;
	}

	public static void main(String[] args) {
		char board[][] = new char[][]{{'.', '8', '7', '6', '5', '4', '3', '2', '1'}, {'2', '.', '.', '.', '.', '.', '.', '.', '.'}, {'3', '.', '.', '.', '.', '.', '.', '.', '.'}, {'4', '.', '.', '.', '.', '.', '.', '.', '.'}
				, {'5', '.', '.', '.', '.', '.', '.', '.', '.'}, {'6', '.', '.', '.', '.', '.', '.', '.', '.'}, {'7', '.', '.', '.', '.', '.', '.', '.', '.'}, {'8', '.', '.', '.', '.', '.', '.', '.', '.'}, {'9', '.', '.', '.', '.', '.', '.', '.', '.'}};

		System.out.println(isValidSudoku(board));
	}
}
