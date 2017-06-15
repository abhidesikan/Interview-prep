package com.abhidesikan.interviewprep.leetcode;

import java.util.HashMap;

/**
 * Created by abhidesikan on 6/14/17.
 */
public class RomanToInteger {

	public static int romanToInt(String s) {
		if (s.length() < 1) {
			return -1;
		}
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('M', 1000);
		map.put('D', 500);
		map.put('C', 100);
		map.put('L', 50);
		map.put('X', 10);
		map.put('V', 5);
		map.put('I', 1);

		int num = 0;
		num = map.get(s.charAt(s.length() - 1));

		for (int i = s.length() - 2; i >= 0; i--) {
			if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
				num += map.get(s.charAt(i));
			} else {
				num -= map.get(s.charAt(i));
			}
		}
		return num;
	}

	public static void main(String[] args) {
		System.out.println(romanToInt("LD"));
	}
}
