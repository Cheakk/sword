package com.sword.tree;

/**
 * @author Eden.Chen
 *         输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同
 */
public class Solution13 {
	public boolean VerifySquenceOfBST(int[] sequence) {
		if (sequence.length == 0) {
			return false;
		}
		return isSearchTree(sequence, 0, sequence.length - 1);
	}

	public boolean isSearchTree(int[] sequence, int start, int end) {
		if (start > end) {
			return true;
		}
		// 左右子树分界点
		int index;
		for (index=start; index < end; index++) {
			if (sequence[index] > sequence[end]) {
				break;
			}
		}
		// 右子树是否大于根节点
		for (int next = index; next < end; next++) {
			if (sequence[next] < sequence[end]) {
				return false;
			}
		}
		// 分别校验左右子树
		return isSearchTree(sequence, 0, index - 1) && isSearchTree(sequence, index, end - 1);
	}

}
