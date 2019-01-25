package com.abhidesikan.interviewprep.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule {

	public static boolean canFinish(int numCourses, int[][] prerequisites) {

		int inDegree[] = new int[numCourses];

		for (int i = 0; i < prerequisites.length; i++) {
			inDegree[prerequisites[i][1]]++;
		}

		Queue<Integer> queue = new LinkedList<>();

		for (int i = 0; i < inDegree.length; i++) {
			if (inDegree[i] == 0) {
				queue.offer(i);
			}
		}

		while (!queue.isEmpty()) {
			int temp = queue.poll();
			for (int i = 0; i < prerequisites.length; i++) {
				if (prerequisites[i][0] == temp) {
					inDegree[prerequisites[i][1]]--;
					if (inDegree[prerequisites[i][1]] == 0) {
						queue.offer(prerequisites[i][1]);
					}
				}
			}
		}

		for (int i = 0; i < inDegree.length; i++) {
			if (inDegree[i] != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(canFinish(2, new int[][]{{0,1}}));
	}
}
