package com.abhidesikan.interviewprep.BigO;

import com.abhidesikan.interviewprep.careercup.Node;

/**
 * Created by abhidesikan on 4/27/17.
 */
public class ValidBST {

    public static boolean checkBST(Node node) {
        if(node == null) {
            return false;
        }
        return checkBST(node, null, null);
    }

    public static boolean checkBST(Node node, Integer min, Integer max) {

        if(node == null) {
            return true;
        }

        if((max != null && node.data >= max) || (min != null && node.data <= min)) {
            System.out.println(node.data + " data " + max + " max ");
            return false;
        }

        return checkBST(node.left, min, node.data) && checkBST(node.right, node.data, max);
    }

    public static void main(String[] args) {
        Node node = new Node(5);
        node.left = new Node(3);
        node.right = new Node(7);
        node.left.left = new Node(1);
        node.left.right = new Node(2);
        node.right.left = new Node(6);
        node.right.right = new Node(8);
        System.out.println(checkBST(node));
    }
}
