package com.sword.tree;

import java.util.Arrays;

/**
 * @author Eden.Chen
 *����ĳ��������ǰ���������������Ľ�������ؽ����ö����������������ǰ���������������Ľ���ж������ظ������֡���������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ�������������
 */
public class Solution10 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
    	if(pre.length==0||in.length ==0) {
    		return null;
    	}
    	//���ڵ�
    	TreeNode tn = new TreeNode(pre[0]);
    	//������������ĸ��ڵ�λ��
    	for(int i= 0;i<in.length;i++) {
    		if(in[i] == pre[0]) {
    			//�����������������
    			int[] left = Arrays.copyOfRange(in, 0, i+1);
    			int[] right = Arrays.copyOfRange(in, i+1, in.length);
    			//�ݹ鹹����������������
    			reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1),left);
    			reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length),right);
    			break;
    		}
    	}
    	return tn;
    }
}
