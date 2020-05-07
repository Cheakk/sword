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
         * ��ȡͷ��
         */
        /**
         * ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}
         */
        if (pre.length==0 || in.length==0) {
            return null;
        }
        TreeNode node = new TreeNode(pre[0]);
        /**
         * ���ݸ��з���������
         */
        for (int i = 0; i < in.length; i++) {
            if (in[i] == pre[0]) {
                // ������ߵ���������
                int[] left = Arrays.copyOfRange(in, 0, i);
                int[] right = Arrays.copyOfRange(in, i+1, in.length);
                /**
                 * ����ҿ�
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
