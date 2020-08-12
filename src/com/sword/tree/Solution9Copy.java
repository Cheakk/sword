package com.sword.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Eden.Chen
 *         请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 */
public class Solution9Copy {
	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		if (pRoot == null) {
			return result;
		}
		// 辅助队列
		Queue<TreeNode> que = new LinkedList<TreeNode>();
		que.add(pRoot);
		// 反转编者
		boolean change = false;
		while (!que.isEmpty()) {
			// 本层结果
			ArrayList<Integer> list = new ArrayList<Integer>();
			int size = que.size();
			int index = 0;
			// 填充下一层
			while (index < size) {
				TreeNode temp = que.poll();
				list.add(temp.val);
				if (temp.left != null) {
					que.add(temp.left);
				}
				if (temp.right != null) {
					que.add(temp.right);
				}
				index++;
			}
			change = !change;
			// 是否需要反转
			if (change) {
				result.add(list);
			} else {
				Stack<Integer> stack = new Stack<>();
				ArrayList<Integer> changeList = new ArrayList<>();
				for (Integer it : list) {
					stack.add(it);
				}
				while (!stack.isEmpty()) {
					changeList.add(stack.pop());
				}
				result.add(changeList);
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
		treeNode.left.left = new TreeNode(9);
		treeNode.left.right = new TreeNode(10);
		Solution9Copy s9 = new Solution9Copy();
		s9.Print(treeNode);
	}
}
