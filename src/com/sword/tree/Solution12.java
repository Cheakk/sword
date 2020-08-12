package com.sword.tree;

/**题目描述
操作给定的二叉树，将其变换为源二叉树的镜像。
 * @author Eden.Chen
 *
 */
public class Solution12 {
	
    public void Mirror(TreeNode root) {
    	if(root==null) {
    		return;
    	}
    	swap(root);
    	Mirror(root.left);
    	Mirror(root.right);
    	
    }

	private void swap(TreeNode root) {
		TreeNode index = root.left; 
		root.left = root.right;
		root.right =index;
		
	}
	
	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(2);
		node.right = new TreeNode(3);
		Solution12 s12 =new Solution12();
		System.out.println(node.toString());
		s12.swap(node);
		System.out.println(node.toString());
	}

}
