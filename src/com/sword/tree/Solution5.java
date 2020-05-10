package com.sword.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8） 中，按结点数值大小顺序第三小结点的值为4。
 * 
 * @author Administrator
 *
 */
public class Solution5 {
	List<TreeNode> nodeList = new ArrayList<TreeNode>();

	TreeNode KthNode(TreeNode pRoot, int k) {
		if (pRoot == null || k == 0) {
			return null;
		}

		inOrder(pRoot);
		return --k < nodeList.size() ? nodeList.get(k) : null;

	}

	private void inOrder(TreeNode pRoot) {
		if (pRoot != null) {
			inOrder(pRoot.left);
			nodeList.add(pRoot);
			inOrder(pRoot.right);
		}

	}
}
