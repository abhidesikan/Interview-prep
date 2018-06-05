package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PermutationBacktracking {

	public static List<List<Character>> permute(char[] nums) {
		List<List<Character>> list = new ArrayList<>();
		// Arrays.sort(nums); // not necessary
		backtrack(list, new ArrayList<>(), nums);
		return list;
	}

	private static void backtrack(List<List<Character>> list, List<Character> tempList, char[] nums) {
		if (tempList.size() == nums.length) {
			System.out.println("adding permutation " + tempList);
			list.add(new ArrayList<>(tempList));
		} else {
			for (int i = 0; i < nums.length; i++) {
				System.out.println("Adding before duplicate " + nums[i]);
				System.out.println("temp list contents " + tempList);
				if (tempList.contains(nums[i])) continue; // element already exists, skip
				System.out.println("Adding " + nums[i]);
				tempList.add(nums[i]);
				backtrack(list, tempList, nums);
				System.out.println("Printing index value " + i);
				System.out.println("Removing " + tempList.get(tempList.size()-1));
				tempList.remove(tempList.size() - 1);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(permute("abcd".toCharArray()));
	}
}
