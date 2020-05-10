package com.sword.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Administrator
 *
 *
 *         ����һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء�ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ�롣
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
