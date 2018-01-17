package com.abhidesikan.interviewprep.leetcode;

public class TicTacToe {

	int row1[];
	int col1[];
	int row2[];
	int col2[];
	int diagonal1l;
	int diagonal1r;
	int diagonal2l;
	int diagonal2r;
	int n;
	/** Initialize your data structure here. */
	public TicTacToe(int n) {
		row1 = new int[n];
		col1 = new int[n];
		row2 = new int[n];
		col2 = new int[n];
		this.n = n;
	}

	/** Player {player} makes a move at ({row}, {col}).
	 @param row The row of the board.
	 @param col The column of the board.
	 @param player The player, can be either 1 or 2.
	 @return The current winning condition, can be either:
	 0: No one wins.
	 1: Player 1 wins.
	 2: Player 2 wins. */
	public int move(int row, int col, int player) {
		if(player == 1) {
			row1[row]++;
			col1[col]++;
			if(row == col) {
				diagonal1l++;
			}
			if(row + col == n-1) {
				diagonal1r++;
			}

			if(row1[row] == n || col1[col] == n || diagonal1l == n || diagonal1r == n) {
				System.out.println(row1[row] + " " + col1[col] + " " + n);
				return 1;
			}
		} else {
			row2[row]++;
			col2[col]++;
			if(row == col) {
				diagonal2l++;
			}
			if(row + col == n-1) {
				diagonal2r++;
			}
			if(row2[row] == n || col2[col] == n || diagonal2l == n || diagonal2r == n) {
				System.out.println(row2[row] + " " + col2[col] + " " + n);
				return 2;
			}
		}
		return 0;

	}
}
