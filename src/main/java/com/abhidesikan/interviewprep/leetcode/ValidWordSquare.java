package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ValidWordSquare {

	public static boolean validWordSquare(List<String> words) {

		for(int i=0; i<words.size(); i++) {
			String temp = words.get(i);

			for(int j=0; j<temp.length(); j++) {
				if(j >= words.size()) {
					return false;
				}
				if(words.get(j).length() <= i) {
					return false;
				}
				if(temp.charAt(j) != words.get(j).charAt(i)) {
					return false;
				}
			}
		}

		return true;
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("ab");
		list.add("ba");
		System.out.println(validWordSquare(list));
	}
}
