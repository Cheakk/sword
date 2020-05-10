package com.sword.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 * 
 * 二叉树的序列化是指：把一棵二叉树按照某种遍历方式的结果以某种格式保存为字符串，从而使得内存中建立起来的二叉树可以持久保存。序列化可以基于先序、中序、后序、层序的二叉树遍历方式来进行修改，序列化的结果是一个字符串，序列化时通过
 * 某种符号表示空节点（#），以 ！ 表示一个结点值的结束（value!）。
 * 
 * 二叉树的反序列化是指：根据某种遍历顺序得到的序列化字符串结果str，重构二叉树。
 * 
 * 例如，我们可以把一个只有根节点为1的二叉树序列化为"1,"，然后通过自己的函数来解析回这个二叉树
 * 
 * @author Administrator
 *
 */
public class Solution6 {
	String Serialize(TreeNode root) {
		if (root == null) {
			return "#";
		}
		return root.val + "," + Serialize(root.left) + "," + Serialize(root.right);
	}

	TreeNode Deserialize(String str) {
		String[] stringList = str.split(",");
		Queue<String> queue = new LinkedList<String>();
		for(int i = 0;i<stringList.length;i++) {
			queue.add(stringList[i]);
		}
		return DeserializeQueue(queue);

	}

	private TreeNode DeserializeQueue(Queue<String> queue) {
		String head = queue.poll();
		if(head.equals("#")) {
			return null;
		}
		TreeNode treeNode = new TreeNode(Integer.valueOf(head));
		treeNode.left = DeserializeQueue(queue);
		treeNode.right = DeserializeQueue(queue);
		// TODO Auto-generated method stub
		return treeNode;
	}
	
	public static void main(String[] args) {
		TreeNode treeNode = new TreeNode(1);
		treeNode.left = new TreeNode(2);
		treeNode.left.left = new TreeNode(3);
		treeNode.left.right = new TreeNode(4);
		Solution6 s6 =new Solution6();
		"#".split(",");
		System.out.println(s6.Serialize(treeNode));
		s6.Deserialize(s6.Serialize(treeNode));
		
	}
}
