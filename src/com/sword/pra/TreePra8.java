package com.sword.pra;

public class TreePra8 {
    
    /**
     * 子树的问题
     * @author Eden.Chen
     *
     */

    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public class Solution {
        public boolean HasSubtree(TreeNode root1,TreeNode root2) {
            
            boolean result = false;
            if(root1 == null ||root2 == null){
                result = false;
            }
            //根
            if(root1.val == root2.val) {
                result =  compareRoot(root1,root2);
            }
            if (!result) {
                result =  HasSubtree(root1.left,root2);
            } 
            if (!result) {
                result =  HasSubtree(root1.right,root2);
            }
            return result;
            
        }
        
        boolean compareRoot(TreeNode root1,TreeNode root2){
            if(root2 == null) {
                return true;
            }
            if(root1 == null) {
                return false;
            }
            if(root1.val != root2.val) {
                return false;
            }
            
            return compareRoot(root1.left,root2.left)&&compareRoot(root1.right,root2.right);
            
            
            
        }
        
        
        
        
        
        
        
        
    }
    
}