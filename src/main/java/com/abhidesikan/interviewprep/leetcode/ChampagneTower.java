package com.abhidesikan.interviewprep.leetcode;

public class ChampagneTower {
	public static double champagneTower(int poured, int query_row, int query_glass) {
		double [][] arr = new double [101][101];
		arr[0][0] = poured;

		for(int i=0; i<= query_row; i++) {
			for(int j=0; j<=i ; j++) {
				if(arr[i][j] > 1) {
					double d = arr[i][j] - 1;
					arr[i][j] = 1;
					arr[i+1][j] += d/2;
					arr[i+1][j+1] += d/2;
				}
			}
		}
		return arr[query_row][query_glass];
	}

	public static void main(String[] args) {
		System.out.println(champagneTower(4, 2, 1));
	}

}
