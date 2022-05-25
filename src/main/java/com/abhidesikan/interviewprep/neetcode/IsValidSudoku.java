package com.abhidesikan.interviewprep.neetcode;

import java.util.HashSet;

public class IsValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        HashSet<String> uniqueSet = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] != '.') {
                    if (uniqueSet.contains("row" + i + board[i][j]) || uniqueSet.contains("column" + j + board[i][j])) {
                        return false;
                    }
                    uniqueSet.add("row" + i + board[i][j]);
                    uniqueSet.add("column" + j + board[i][j]);

                    if (uniqueSet.contains("box" + i / 3 + j / 3 + board[i][j])) {
                        return false;
                    }
                    uniqueSet.add("box" + i / 3 + j / 3 + board[i][j]);
                }
            }
        }
        return true;
    }
}
