package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(list, new ArrayList<>(), nums, 0);
		return list;
	}

	private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
		System.out.println("Adding to master list : " + tempList);
		System.out.println(start + " start  ");
		list.add(new ArrayList<>(tempList));
		for (int i = start; i < nums.length; i++) {
			System.out.println("Adding item to list : " + nums[i]);
			tempList.add(nums[i]);
			backtrack(list, tempList, nums, i + 1);
			System.out.println("Removing element from list : " + tempList.get(tempList.size() - 1));
			tempList.remove(tempList.size() - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(subsets(new int[]{1, 2, 3}));
	}
}
