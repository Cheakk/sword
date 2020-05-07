package com.sword.pra;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ¶þ²æ˜äÉî¶È
 * 
 * @author Eden.Chen
 *
 */
public class TreeDepth {

    public static int TreeDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int d = 0, count = 0, nextcount = q.size();
        while (q.size() != 0) {
            TreeNode t = q.poll();
            count++;
            if (t.left != null) {
                q.add(t.left);
            }
            if (t.right != null) {
                q.add(t.right);
            }
            if (count == nextcount) {
                System.out.println("count=  "+count);
                d++;
                count = 0;
                nextcount = q.size();
                System.out.println(nextcount);
            }
        }
        return d;      
    }
    
    
    
    
    public static void main(String[] args) {
        TreeNode t = new TreeNode(0);
        t.left = new TreeNode(0);
        t.right = new TreeNode(1);
        t.right.right = new  TreeNode(2);
        System.out.println("d"+ TreeDepth1(t)); ;
    }
}
