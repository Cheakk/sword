package com.sword.pra;

import java.util.ArrayList;

public class TreePra10 {

    /**
     * 输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
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

    public static class Solution {
        
        private static ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
        private static ArrayList<Integer> list = new ArrayList<Integer>();
        public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
            if(root == null) 
                return listAll;
            list.add(root.val); 
            target -= root.val;
            if(target == 0 )
                listAll.add(new ArrayList<Integer>(list));
            FindPath(root.left, target); 
            FindPath(root.right, target);
            list.remove(list.size()-1);
            return listAll;
        }
    }
    
    
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        TreeNode treeLeft = new TreeNode(2);
        treeLeft.left = new TreeNode(1);
        TreeNode treeRight = new TreeNode(1);
        treeRight.left = new TreeNode(3);
        treeRight.right = new TreeNode(1);
        tree.left = treeLeft;
        tree.right = treeRight;
        ArrayList<ArrayList<Integer>>  aa = Solution.FindPath(tree,3 );
        System.out.println("aaaaaaaa");
        
        
    }
}