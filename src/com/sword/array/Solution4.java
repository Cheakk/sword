package com.sword.array;

/**
 * ͳ�����������г��ֵĴ���
 * 
 * @author Administrator
 *
 */
public class Solution4 {
	public int GetNumberOfK(int[] array, int k) {
		if (array.length == 0) {
			return 0;
		}
		int index = findIndex(array, k);
		int count = 0;
		if (index != -1) {
			for (int i = index; i < array.length; i++) {
				if (array[i] == k) {
					count++;
				} else {
					break;
				}
			}
			for (int i = index-1; i>=0; i--) {
				if (array[i] == k) {
					count++;
				} else {
					break;
				}
			}
		}
		return count;
	}

	// ���ַ�����
	private int findIndex(int[] array, int k) {
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int middle = (low + high) / 2;
			if (k == array[middle]) {
				return middle;
			}
			if (k > array[middle]) {
				low = middle + 1;
			}
			if (k < array[middle]) {
				high = middle - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arrays = new int[] { 3, 3, 3, 3, 3, 4, 4, 5 };
		Solution4 s4 = new Solution4();
		System.out.println(s4.GetNumberOfK(arrays, 3));
	}
}
