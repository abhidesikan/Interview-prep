package com.abhidesikan.interviewprep.leetcode;

public class MinCost {

	public static int minCost(int[][] costs) {

		if(costs.length == 0 || costs[0].length == 0) {
			return 0;
		}

		for(int i=1; i<costs.length; i++) {
			costs[i][0] += Math.min(costs[i-1][1], costs[i-1][2]);
			costs[i][1] += Math.min(costs[i-1][0], costs[i-1][2]);
			costs[i][2] += Math.min(costs[i-1][0], costs[i-1][1]);
		}

		int n = costs.length -1;

		return Math.min(costs[n][0], Math.min(costs[n][1], costs[n][2]));
	}

	public static void main(String[] args) {
		System.out.println(minCost(new int[][] {{1,2,3}, {4,5,2}, {5,6,1}}));
	}
}
