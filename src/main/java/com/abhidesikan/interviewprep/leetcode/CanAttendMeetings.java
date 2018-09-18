package com.abhidesikan.interviewprep.leetcode;

import java.util.Arrays;

public class CanAttendMeetings {
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

	public static boolean canAttendMeetings(Interval[] intervals) {

		Arrays.sort(intervals, (Interval a, Interval b) -> a.end - b.end);

		for (int i = 0; i < intervals.length - 1; i++) {
			if (intervals[i].end > intervals[i + 1].start) {
				return false;
			}
		}

		return true;
	}

}
