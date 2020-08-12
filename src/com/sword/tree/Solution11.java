package com.sword.tree;

/**
 * @author Eden.Chen
 *�������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��
 */
public class Solution11 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;
    	if(root1==null||root2==null) {
    		return result;
    	}
    	//���ڵ���ͬ���ж������ڵ��Ƿ���ͬ
    	if(root1.val  == root2.val ) {
    		result = tree1equaltree2(root1,root2);
    	}
    	//���ڵ㲻ͬ��������������Ϊ������²���
    	if(!result) {
    		HasSubtree(root1.left,root2);
    	}
    	if(!result) {
    		HasSubtree(root1.right,root2);
    	}
    	return result ;
    }

	private boolean tree1equaltree2(TreeNode root1, TreeNode root2) {
		//b��Ϊ�� ��˵������
		if(root2 ==null) {
			return true;
		}
		//a��Ϊ��b����Ϊ�գ�˵��������
		if(root1 == null) {
			return false;
		}
		//��һ���ڵ㲻ͬ��˵��������
		if(root1.val!=root2.val) {
			return false;
		}
		//�Ƚ���������
		return tree1equaltree2(root1.left,root2.left)&&tree1equaltree2(root1.right,root2.right);
	}
}
