package com.abhidesikan.interviewprep.leetcode;

import java.util.*;

public class FindItinerary {

	static List<String> result;

	public static List<String> findItinerary(String[][] tickets) {
		result = new ArrayList<>();

		HashMap<String, List<String>> map = new HashMap<>();

		for (String[] ticket : tickets) {
			if (!map.containsKey(ticket[0])) {
				map.put(ticket[0], new ArrayList<>());
			}
			map.get(ticket[0]).add(ticket[1]);
		}

		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			Collections.sort(entry.getValue());
		}

		findItinerary(map, new ArrayList<String>(), "JFK", tickets.length);
		result.add(0, "JFK");
		return result;
	}

	public static void findItinerary(HashMap<String, List<String>> map, List<String> curRes, String start, int numOfTickets) {

		if (curRes.size() == numOfTickets) {
			result.addAll(curRes);
			return;
		}

		if (map.get(start) == null) {
			return;
		}

		for (int i = 0; i < map.get(start).size(); i++) {
			String dest = map.get(start).get(i);
			map.get(start).remove(dest);
			curRes.add(dest);
			findItinerary(map, curRes, dest, numOfTickets);

			if (result.size() > 0) {
				return;
			}
			map.get(start).add(i, dest);
			curRes.remove(curRes.size() - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(findItinerary(new String[][] {{"MUC","LHR"},{"JFK","MUC"},{"SFO","SJC"},{"LHR","SFO"}}));
	}
}
