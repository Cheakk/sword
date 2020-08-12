package com.sword.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Eden.Chen
 *         请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 */
public class Solution9 {
	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
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
				System.out.println(arraychange);
			} else {
				result.add(array);
				System.out.println(array);

			}

		}
		return result;
	}
	public static void main(String[] args) {
		TreeNode treeNode = new TreeNode(1);
		treeNode.left = new TreeNode(2);
		treeNode.right = new TreeNode(3);
		treeNode.right.left = new TreeNode(4);
		treeNode.right.right = new TreeNode(5);
		Solution9 s9 = new Solution9();
		s9.Print(treeNode);
	}
}
