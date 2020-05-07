package com.sword.pra;

public class TreePra9 {

    /**
     * 子树的问题
     * 
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

        public void HasSubtree(TreeNode root) {
            if (root == null) {
                return;
            }
            swap(root);
            HasSubtree(root.left);
            HasSubtree(root.right);
           
        }
        
        public void swap (TreeNode root) {
            TreeNode index = root.left;
            root.left = root.right;
            root.right = index;
        }
        
        
    }
}