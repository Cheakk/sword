package com.sword.tree;

/**
 * @author Eden.Chen
 *         ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ��������������Yes,�������No���������������������������ֶ�������ͬ
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
		// ���������ֽ��
		int index;
		for (index=start; index < end; index++) {
			if (sequence[index] > sequence[end]) {
				break;
			}
		}
		// �������Ƿ���ڸ��ڵ�
		for (int next = index; next < end; next++) {
			if (sequence[next] < sequence[end]) {
				return false;
			}
		}
		// �ֱ�У����������
		return isSearchTree(sequence, 0, index - 1) && isSearchTree(sequence, index, end - 1);
	}

}
