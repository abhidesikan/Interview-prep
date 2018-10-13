package com.abhidesikan.interviewprep.leetcode;

public class WalkDiagonal {

	static Integer input [][]={{1,2,4},{1,3,5},{2,5,6},{1,3,3}};
	public static void main(String[] args) {
		walkDiagonals(input);
	}
	public static void walkDiagonals(Integer data[][]){

		for(int i=0; i<data[0].length; i++) {
			System.out.println(data[0][i]);
			checkIfDiagonalExists(data, 0, i);
		}

		for(int j=1; j<data.length; j++) {
			System.out.println("here");
			System.out.println(data[j][data[0].length-1]);
			checkIfDiagonalExists(data, j, data[0].length-1);
		}
	}

	public static void checkIfDiagonalExists(Integer data[][], int i, int j) {
		if(i+1 < data.length && j-1 >=0 ) {
			System.out.println(data[i+1][j-1]);
			checkIfDiagonalExists(data, i+1, j-1);
		}
	}
}
