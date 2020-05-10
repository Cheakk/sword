package com.sword.tree;

/**
 * @author Administrator ��ʵ��һ�������������ж�һ�Ŷ������ǲ��ǶԳƵġ�ע�⣬���һ��������ͬ�˶������ľ�����ͬ���ģ�������Ϊ�ԳƵ�
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
