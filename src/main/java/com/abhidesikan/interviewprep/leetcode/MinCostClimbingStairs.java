package com.abhidesikan.interviewprep.leetcode;

public class MinCostClimbingStairs {

	public static int minCostClimbingStairs(int[] cost) {

		int [] mc = new int[cost.length+1];
		mc[0] = cost[0];
		mc[1] = cost[1];

		for(int i=2; i<=cost.length; i++) {
			int costHere = (i==cost.length)? 0 : cost[i];
			mc[i] = Math.min(costHere + mc[i-1], costHere + mc[i-2]);
		}

		return mc[cost.length];
	}

	public static void main(String[] args) {
		System.out.println(minCostClimbingStairs(new int[] {1,2,4,2,5}));
	}
}
