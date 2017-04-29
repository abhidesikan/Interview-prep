package com.abhidesikan.interviewprep.careercup;


import java.util.HashMap;

/**
 * Created by abhidesikan on 4/26/17.
 */
public class MaxNodes {

    private static HashMap<Integer, Node> map = new HashMap<Integer,Node>();

    public static int maxCount = 0;

    public static int getMaxNodes(Node node) {
        if(node != null) {
            if(!map.containsKey(node.data)) {
                map.put(node.data, node);
                getMaxNodes(node.left);
                getMaxNodes(node.right);
            }
        }

        return map.size();
    }

    public static void main(String args[]) {
        Node node = new Node(1);
        Node left = new Node(2);
        Node right = new Node(3);
        node.left = left;
        node.right = right;
        Node left2 = new Node(5);
        Node left3 = new Node(6);
        left.left = left2;
        left.right = left3;
        System.out.println(getMaxNodes(node));
    }
}
