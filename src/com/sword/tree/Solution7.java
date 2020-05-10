package com.sword.tree;

/**
 * @author 平衡二叉树
 */
public class Solution7 {

	
		//判断高度差
	   public boolean IsBalanced_Solution(TreeNode root) {
	        if(root == null) {
	        	return true;
	        }
	        
	        int left = treedeapth(root.left);
	        int right = treedeapth(root.right);
	        int distance = left-right;
	        if(Math.abs(distance)>1) {
	        	return false;
	        }
	        return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
	    }
	   
	   
	   int  treedeapth(TreeNode root){
		   if(root!=null) {
			   int left = treedeapth(root.left);
			   int right = treedeapth(root.right);
			   return left>right?left+1:right+1;
		   }
		return 0;
	   }
}
