package com.abhidesikan.interviewprep.careercup;

/**
 * Created by abhidesikan on 4/26/17.
 */
public class FindMirrored {

    public static boolean findMirrored(Node root) {

        if(root == null) {
            return false;
        }
        return findMirrored(root.left, root.right);
    }

    public static boolean findMirrored(Node a, Node b) {
        if(a == null && b == null) {
            return true;
        }
        if(a == null || b ==  null) {
            return false;
        }
        if(a.data == b.data) {
            return findMirrored(a.left, b.right) && findMirrored(a.right, b.left);
        }
        return false;
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);
        System.out.println(findMirrored(root));
    }
}
