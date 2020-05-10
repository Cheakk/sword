package com.sword.tree;

/**
 * @author Administrator 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的
 */
public class Solution8 {

	boolean isSymmetrical(TreeNode pRoot) {
		if (pRoot == null) {
			return true;
		} else
			return isbalance(pRoot.left, pRoot.right);
	}

	private boolean isbalance(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		}
		if (left == null || right == null) {
			return false;
		}
		if (left.val == right.val) {
			return isbalance(left.left, right.right) && isbalance(left.right, right.left);
		}else {
			return false;
		}

	}
}
