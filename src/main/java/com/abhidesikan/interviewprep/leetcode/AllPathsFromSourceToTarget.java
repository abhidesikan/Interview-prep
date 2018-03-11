package com.abhidesikan.interviewprep.leetcode;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourceToTarget {
	public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {

		List<List<Integer>> paths = new ArrayList<>();
		if(graph.length == 0) {
			return paths;
		}

		List<Integer> path = new ArrayList();
		path.add(0);
		checkPaths(0, path, paths, graph);

		return paths;
	}

	public static void checkPaths(int index, List<Integer> path, List<List<Integer>> paths, int [][] graph) {
		if(index == graph.length - 1) {
			paths.add(new ArrayList<Integer>(path));
		}

		for(int i=0; i<graph[index].length; i++) {
			path.add(graph[index][i]);
			checkPaths(graph[index][i], path, paths, graph);
			path.remove(path.size()-1);
		}
	}

	public static void main(String[] args) {
		System.out.println(allPathsSourceTarget(new int[][] {{1,2}, {3}, {3}, {}}));
	}
}
