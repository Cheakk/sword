package com.sword.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 * 
 * @author Administrator
 *
 */
public class Solution4 {
	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

	ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		if (pRoot == null) {
			return result;
		}
		Queue<TreeNode> que = new LinkedList<TreeNode>();
		que.add(pRoot);
		boolean change = true;
		while (!que.isEmpty()) {
			int size = que.size();
			int index = 0;
			change = !change;
			ArrayList<Integer> array = new ArrayList<Integer>();
			while (index < size) {
				TreeNode node = que.poll();
				array.add(node.val);
				if (node.left != null) {
					que.add(node.left);
				}
				if (node.right != null) {
					que.add(node.right);
				}
				index++;
			}
			if (change) {
				Stack<Integer> stack = new Stack<Integer>();
				ArrayList<Integer> arraychange = new ArrayList<Integer>();
				for (Integer k : array) {
					stack.add(k);
				}
				while (!stack.isEmpty()) {
					arraychange.add(stack.pop());
				}
				result.add(arraychange);
			} else {
				result.add(array);

			}

		}
		return result;

	}

	public static void main(String[] args) {
		Solution4 s3 = new Solution4();
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(2);
		node.right = new TreeNode(3);
		node.right.right = new TreeNode(3);
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		result = s3.Print(node);
		System.out.println(1123);
	}
}
