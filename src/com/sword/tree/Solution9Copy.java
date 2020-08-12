package com.sword.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Eden.Chen
 *         ��ʵ��һ����������֮���δ�ӡ������������һ�а��մ����ҵ�˳���ӡ���ڶ��㰴�մ��������˳���ӡ�������а��մ����ҵ�˳���ӡ���������Դ����ơ�
 */
public class Solution9Copy {
	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		if (pRoot == null) {
			return result;
		}
		// ��������
		Queue<TreeNode> que = new LinkedList<TreeNode>();
		que.add(pRoot);
		// ��ת����
		boolean change = false;
		while (!que.isEmpty()) {
			// ������
			ArrayList<Integer> list = new ArrayList<Integer>();
			int size = que.size();
			int index = 0;
			// �����һ��
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
			// �Ƿ���Ҫ��ת
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
