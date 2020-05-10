package com.sword.array;

/**
 * ����һ������A[0,1,...,n-1],�빹��һ������B[0,1,...,n-1],����B�е�Ԫ��B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]��
 * ����ʹ�ó�������ע�⣺�涨B[0] = A[1] * A[2] * ... * A[n-1]��B[n-1] = A[0] * A[1] * ... *
 * A[n-2];��
 * 
 * @author Eden.Chen
 *
 */
public class Solution2 {
	public boolean duplicate(int numbers[], int length, int[] duplication) {
		boolean[] list = new boolean[length];
		for(int i = 0; i< length;i++) {
			if(list[numbers[i]] == true) {
				duplication[0] = numbers[i];
				return true;
			}
			list[numbers[i]] = true ;
		}
		return false;
	}
}
