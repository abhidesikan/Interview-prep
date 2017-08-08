package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReverseFibonacci {


	public void reverseFibonacci(int a, int b) {
		List<Integer> list = new ArrayList<>();

		list.add(a);
		list.add(b);

		while (a - b > 0) {
			int diff = a - b;
			list.add(diff);
			a = b;
			b = diff;
		}
		list.add(0);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void main(String[] args) {
		new ReverseFibonacci().reverseFibonacci(5, 3);
	}

}
