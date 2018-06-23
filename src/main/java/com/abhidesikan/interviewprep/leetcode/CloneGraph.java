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
		HashMap<Integer, UndirectedGraphNode> map = new HashMap<>();

		UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
		map.put(node.label, newNode);
		Queue<UndirectedGraphNode> queue = new LinkedList<>();

		queue.add(node);

		while(!queue.isEmpty()) {
			UndirectedGraphNode temp = queue.remove();
			for(UndirectedGraphNode n : temp.neighbors) {
				if(!map.containsKey(n.label)) {
					map.put(n.label, new UndirectedGraphNode(n.label));
					queue.add(n);
				}
				map.get(temp.label).neighbors.add(map.get(n.label));
			}
		}
		return newNode;
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

		System.out.println(cloneGraph(node).label);

	}
}
