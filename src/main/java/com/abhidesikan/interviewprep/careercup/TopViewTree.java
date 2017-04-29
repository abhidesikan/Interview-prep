package com.abhidesikan.interviewprep.careercup;

/**
 * Created by abhidesikan on 4/26/17.
 */
public class TopViewTree {

    public static void printTopView(Node root) {
        System.out.println(root.data);
        Node left = root.left;
        Node right = root.right;
        while(left!= null) {
            System.out.println(left.data);
            left = left.left;
        }
        while(right != null) {
            System.out.println(right.data);
            right = right.right;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        printTopView(root);
    }
}
