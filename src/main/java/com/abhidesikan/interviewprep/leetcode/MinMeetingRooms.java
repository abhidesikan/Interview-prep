package com.abhidesikan.interviewprep.leetcode;

import java.util.Map;
import java.util.TreeMap;

public class MinMeetingRooms {

	public class Interval {
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

	public int minMeetingRooms(Interval[] intervals) {
		TreeMap<Integer, Integer> map = new TreeMap();

		for (Interval interval : intervals) {
			map.put(interval.start, map.getOrDefault(interval.start, 0) + 1);
			map.put(interval.end, map.getOrDefault(interval.end, 0) - 1);
		}
		int curSum = 0;
		int min = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			min = Math.max(min, curSum += entry.getValue());
		}
		return min;
	}
}

