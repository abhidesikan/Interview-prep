package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumTotalDistance {

	public static int minTotalDistance(int[][] grid) {

		if(grid == null || grid.length == 0){
			return 0;
		}

		//int minX = Integer.MAX_VALUE;
		//int maxX = Integer.MIN_VALUE;
		//int minY = Integer.MAX_VALUE;
		//int maxY = Integer.MIN_VALUE;
		List<Integer> listX = new ArrayList<Integer>();
		List<Integer> listY = new ArrayList<Integer>();

		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[0].length; j++){
				if(grid[i][j] == 1){
					listX.add(i);
					listY.add(j);
					// minX = Math.min(minX, i);
					// maxX = Math.max(maxX, i);
					// minY = Math.min(minY, j);
					// maxY = Math.max(maxY, j);
				}
			}
		}
		int ret = 0;
		Collections.sort(listX);
		Collections.sort(listY);
		int pivotX = listX.get(listX.size() / 2);
		int pivotY = listY.get(listY.size() / 2);

		System.out.println(pivotX);
		System.out.println(pivotY);
		for(Integer x : listX){
			ret = ret + Math.abs(x - pivotX);
		}
		for(Integer y : listY){
			ret = ret + Math.abs(y - pivotY);
		}

		return ret;
	}

	public static void main(String[] args) {
		System.out.println(minTotalDistance(new int[][]{{1,0,0,0,1}, {0,0,0,0,0}, {0,0,1,0,0}}));
	}
}
