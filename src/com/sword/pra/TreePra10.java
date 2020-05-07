package com.sword.pra;

import java.util.ArrayList;

public class TreePra10 {

    /**
     * ����һ�Ŷ������ĸ��ڵ��һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����(ע��: �ڷ���ֵ��list�У����鳤�ȴ�����鿿ǰ)
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