package com.sword.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Administrator
 *
 *
 *         给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */
public class Solution1 {
	//
	List<TreeLinkNode> nodeList = new ArrayList<TreeLinkNode>();

	public TreeLinkNode GetNext(TreeLinkNode pNode) {
		TreeLinkNode node = pNode;
		while (node.next != null) {
			node = node.next;
		}
		inorder(node);
		for (int i = 0; i < nodeList.size(); i++) {
			if (pNode == nodeList.get(i)) {
				return i == nodeList.size() - 1 ? null : nodeList.get(i + 1);
			}
		}
		return null;

	}

	private void inorder(TreeLinkNode node) {
		if (node != null) {
			inorder(node.left);
			nodeList.add(node);
			inorder(node.right);

		}
	}

}
