package com.sword.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * ����һ�ö��������������ҳ����еĵ�kС�Ľ�㡣���磬 ��5��3��7��2��4��6��8�� �У��������ֵ��С˳�����С����ֵΪ4��
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
