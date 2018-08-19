package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

	public static class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}
	}

	public static List<Interval> merge(List<Interval> intervals) {

		int n = intervals.size();

		int[] start = new int[n];
		int[] end = new int[n];

		for (int i = 0; i < n; i++) {
			start[i] = intervals.get(i).start;
			end[i] = intervals.get(i).end;
		}
		Arrays.sort(start);
		Arrays.sort(end);
		List<Interval> result = new ArrayList();

		for (int i = 0, j = 0; i < n; i++) {
			if (i == n - 1 || start[i + 1] > end[i]) {
				result.add(new Interval(start[j], end[i]));
				j = i + 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		List<Interval> intervals = new ArrayList<>();
		intervals.add(new Interval(1,3));
		intervals.add(new Interval(2,6));
		List<Interval> result = merge(intervals);
		result.forEach(System.out::println);
	}
}
