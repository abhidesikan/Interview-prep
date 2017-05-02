package com.abhidesikan.interviewprep.careercup;

import java.util.*;
import java.util.LinkedList;

/**
 * Created by abhidesikan on 5/1/17.
 */
public class SortHashMap {

	public static HashMap<Integer, String> sortMapByValue(HashMap<Integer, String> inputMap) {

		List<Map.Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer, String>>(inputMap.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
			public int compare(Map.Entry<Integer,String> o1, Map.Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		return inputMap;
	}

	public static void printMap(HashMap<Integer, String> map) {
		for(Map.Entry<Integer,String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(2,"Abhi");
		map.put(1, "Desikan");
		map.put(3, "Roji");
		printMap(map);
		System.out.println("later");
		map = sortMapByValue(map);
		printMap(map);
	}
}
