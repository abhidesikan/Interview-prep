package com.abhidesikan.interviewprep.leetcode;

public class TreeToStr {

	public static String tree2str(TreeNode t) {

		if(t == null) {
			return "";
		}

		String result = t.val + "";

		String left = tree2str(t.left);
		String right = tree2str(t.right);

		if(left == "" && right == "") {
			return result;
		}
		else if (left == "") {
			return result + "()" + "(" + right + ")";
		} else if (right == "") {
			return result + "(" + left + ")";
		}
		return result + "(" + left + ")" + "(" + right + ")";
	}

	public static void main(String[] args) {
		TreeNode treeNode = new TreeNode(2);
		treeNode.left = new TreeNode(3);
		treeNode.right = new TreeNode(4);
		System.out.println(tree2str(treeNode));
	}
}
