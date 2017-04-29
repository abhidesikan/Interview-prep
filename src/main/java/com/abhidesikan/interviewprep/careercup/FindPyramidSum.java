package com.abhidesikan.interviewprep.careercup;

/**
 * Created by abhidesikan on 4/26/17.
 */
public class FindPyramidSum {


    public static int findMaxSum(Node node) {
        int value = 0;

        if(node == null) {
            return 0;
        } else {
            value = node.data + Math.max(findMaxSum(node.left), findMaxSum(node.right));
        }

        return value;
    }


    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(2);
        node.left.right = new Node(5);
        node.right.left = new Node(4);
        node.right.right = new Node(9);
        System.out.println(findMaxSum(node));
    }
}
