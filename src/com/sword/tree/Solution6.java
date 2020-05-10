package com.sword.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * ��ʵ�������������ֱ��������л��ͷ����л�������
 * 
 * �����������л���ָ����һ�ö���������ĳ�ֱ�����ʽ�Ľ����ĳ�ָ�ʽ����Ϊ�ַ������Ӷ�ʹ���ڴ��н��������Ķ��������Գ־ñ��档���л����Ի����������򡢺��򡢲���Ķ�����������ʽ�������޸ģ����л��Ľ����һ���ַ��������л�ʱͨ��
 * ĳ�ַ��ű�ʾ�սڵ㣨#������ �� ��ʾһ�����ֵ�Ľ�����value!����
 * 
 * �������ķ����л���ָ������ĳ�ֱ���˳��õ������л��ַ������str���ع���������
 * 
 * ���磬���ǿ��԰�һ��ֻ�и��ڵ�Ϊ1�Ķ��������л�Ϊ"1,"��Ȼ��ͨ���Լ��ĺ��������������������
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
