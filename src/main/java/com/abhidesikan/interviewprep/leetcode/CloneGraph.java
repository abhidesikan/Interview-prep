package com.abhidesikan.interviewprep.leetcode;

import java.util.*;

public class CloneGraph {

	static class UndirectedGraphNode {
      int label;
      List<UndirectedGraphNode> neighbors;
      UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
	};

	public static UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {

		if(node == null) {
			return null;
		}

		System.out.println(constructGraph(node));
		return null;
	}

	public static String constructGraph(UndirectedGraphNode node) {
		StringBuilder sb = new StringBuilder();
		Queue<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
		queue.add(node);
		HashMap<UndirectedGraphNode, List<UndirectedGraphNode>> visited = new HashMap<>();

		while(!queue.isEmpty()) {
			UndirectedGraphNode temp = queue.poll();
			sb.append(temp.label);
			for(UndirectedGraphNode adj : temp.neighbors) {
				List tempList = new ArrayList();
				if(!visited.containsKey(adj)) {
					sb.append(",").append(adj.label);
					queue.add(adj);
					tempList.add(adj);
					visited.put(temp, tempList);
				}
			}

			System.out.println();
			sb.append("#");
		}
		return sb.deleteCharAt(sb.length()-1).toString();
	}

	public static void main(String[] args) {
		UndirectedGraphNode node = new UndirectedGraphNode(0);
		UndirectedGraphNode node1 = new UndirectedGraphNode(1);
		UndirectedGraphNode node2 = new UndirectedGraphNode(2);

		node.neighbors.add(node1);
		node.neighbors.add(node2);

		node1.neighbors.add(node);
		node1.neighbors.add(node2);

		node2.neighbors.add(node);
		node2.neighbors.add(node1);
		node2.neighbors.add(node2);

		System.out.println(cloneGraph(node));

	}
}
