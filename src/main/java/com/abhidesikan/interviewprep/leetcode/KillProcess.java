package com.abhidesikan.interviewprep.leetcode;

import java.util.*;

public class KillProcess {

	public static List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {

		HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		int count = 0;
		for (Integer i : ppid) {
			if (map.containsKey(i)) {
				map.get(i).add(pid.get(count));
			} else {
				List temp = new ArrayList();
				temp.add(pid.get(count));
				map.put(i, temp);
			}
			count++;
		}
		System.out.println(map);

		List<Integer> removeList = new ArrayList<>();

		Stack stack = new Stack();
		stack.push(kill);

		while(!stack.isEmpty()) {
			int cur = (Integer)stack.pop();
			removeList.add(cur);
			List<Integer> temp = map.get(cur);
			if (temp == null) {
				continue;
			}
			stack.addAll(temp);
		}

		return removeList;
	}

	public static void main(String[] args) {
		List<Integer> pid = new ArrayList<>();
		pid.add(1);
		pid.add(3);
		pid.add(10);
		pid.add(5);
		List<Integer> ppid = new ArrayList<>();
		ppid.add(3);
		ppid.add(0);
		ppid.add(5);
		ppid.add(3);

		System.out.println(killProcess(pid, ppid, 5));
	}
}
