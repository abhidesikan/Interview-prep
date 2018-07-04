package com.abhidesikan.interviewprep.leetcode;

public class CountBattleships {
	public static int countBattleships(char[][] board) {

		int count = 0;

		if(board.length == 0 || board[0].length == 0) {
			return 0;
		}

		if(board[0][0] == 'X') {
			count++;
		}

		for(int i = 1; i < board[0].length; i++) {
			if(board[0][i] == 'X' && board[0][i-1] == '.') {
				count++;
			}
		}

		for(int i=1; i<board.length; i++) {
			if(board[i][0] == 'X' && board[i-1][0] == '.') {
				count++;
			}
		}

		for(int i=1; i<board.length; i++) {
			for(int j=1; j<board[0].length; j++) {
				if(board[i][j] == 'X' && board[i-1][j] == '.' && board[i][j-1] == '.') {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(countBattleships(new char[][]{{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}}));
	}
}
