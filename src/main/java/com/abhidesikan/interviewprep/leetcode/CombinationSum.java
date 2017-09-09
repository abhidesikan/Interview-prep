package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<List<Integer>> result = new ArrayList<>();
		getResult(result, new ArrayList<Integer>(), candidates, target, 0);

		return result;
	}

	private static void getResult(List<List<Integer>> result, List<Integer> cur, int candidates[], int target, int start) {
		if (target > 0) {
			for (int i = start; i < candidates.length && target >= candidates[i]; i++) {
				cur.add(candidates[i]);
				System.out.println("start "+i);
				System.out.println("Adding "+candidates[i]);
				getResult(result, cur, candidates, target - candidates[i], i);
				System.out.println("Removing "+ cur.get(cur.size()-1));
				cur.remove(cur.size() - 1);
			}
		}
		else if (target == 0) {
			System.out.println("adding to final list" + cur);
			result.add(new ArrayList<Integer>(cur));
		}
	}

	public static void main(String[] args) {
		int candidates[] = {2,3,6,7};
		System.out.println(combinationSum(candidates, 7));
	}

}
