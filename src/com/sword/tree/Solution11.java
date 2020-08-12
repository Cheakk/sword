package com.sword.tree;

/**
 * @author Eden.Chen
 *输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class Solution11 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;
    	if(root1==null||root2==null) {
    		return result;
    	}
    	//根节点相同，判断其他节点是否相同
    	if(root1.val  == root2.val ) {
    		result = tree1equaltree2(root1,root2);
    	}
    	//根节点不同，则以左右子树为起点重新查找
    	if(!result) {
    		HasSubtree(root1.left,root2);
    	}
    	if(!result) {
    		HasSubtree(root1.right,root2);
    	}
    	return result ;
    }

	private boolean tree1equaltree2(TreeNode root1, TreeNode root2) {
		//b树为空 ，说明包含
		if(root2 ==null) {
			return true;
		}
		//a树为空b树不为空，说明不包含
		if(root1 == null) {
			return false;
		}
		//有一个节点不同，说明不包含
		if(root1.val!=root2.val) {
			return false;
		}
		//比较左右子树
		return tree1equaltree2(root1.left,root2.left)&&tree1equaltree2(root1.right,root2.right);
	}
}
