package com.abhidesikan.interviewprep.careercup;

import java.util.*;
import java.util.LinkedList;

/**
 * Created by abhidesikan on 4/29/17.
 */
public class IsGraph {


	static class Node {
		int val;
		List<Node> childNodes;

		public List<Node> getChildren() {
			return childNodes;
		}

		public Node() {

		}
		public Node(int val, List childNodes) {
			this.val = val;
			this.childNodes = childNodes;
		}


	}
	public static boolean isGraph(Node node) {

		Queue<Node> nodes = new LinkedList<Node>();
		Set<Node> visited = new HashSet<Node>();
		nodes.add(node);
		visited.add(node);
		while(!nodes.isEmpty()) {
			Node temp = nodes.remove();
			System.out.println(temp.val);
			if(temp.getChildren() != null) {
				for(Node child : temp.getChildren()) {
					if(visited.contains(child)) {
						return true;
					} else {
						visited.add(child);
						nodes.add(child);
					}
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {
		List list = new ArrayList();
		List list2 = new ArrayList();
		List list3 = new ArrayList();
		Node node = new Node(1, list);
		Node child1 = new Node(2, list2);
		Node child2 = new Node(3, null);
		list.add(child1);
		Node child3 = new Node(4, list3);
		list2.add(child2);
		list2.add(child3);
		list3.add(node);
		System.out.println(isGraph(node));
	}
}
