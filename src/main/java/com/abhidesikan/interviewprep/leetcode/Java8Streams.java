package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Streams {


	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();

		list1.add("Abhi");
		list1.add("Shek");

		list2.add("Abhi");
		list2.add("Sachin");

		list2.forEach(name -> {
			List<String> optional = list1.stream().map(name1 -> name1.toUpperCase()).
					filter(name1 -> name1.startsWith("AB")).
					collect(Collectors.toList());

			optional.forEach(name2 -> System.out.println(name2));
		});
	}

}
