package com.sword.pra;

import java.util.Arrays;

public class Pra2 {

    public static class TreeNode {

        int val;

        TreeNode left;

        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        /**
         * 获取头部
         */
        /**
         * 前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
         */
        if (pre.length==0 || in.length==0) {
            return null;
        }
        TreeNode node = new TreeNode(pre[0]);
        /**
         * 根据根切分左右子树
         */
        for (int i = 0; i < in.length; i++) {
            if (in[i] == pre[0]) {
                // 复制左边的中序排序
                int[] left = Arrays.copyOfRange(in, 0, i);
                int[] right = Arrays.copyOfRange(in, i+1, in.length);
                /**
                 * 左闭右开
                 */
                node.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), left);
                node.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), right);
                break;
            }
        }
        return node;
    }

    public static void main(String[] args) {
        int[] aa = { 1, 2, 4, 7, 3, 5, 6, 8 };
        int[] bb = { 4, 7, 2, 1, 5, 3, 8, 6 };
        
        int[] cc =  Arrays.copyOfRange(aa, 1, 5);
        TreeNode node = reConstructBinaryTree(aa,bb);
        System.out.println("done");
    }
}
