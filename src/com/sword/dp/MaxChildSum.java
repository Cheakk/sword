package com.sword.dp;


/**
 * 这道题是查数字的最大子集
 * @author Administrator
 *
 */
public class MaxChildSum {
	public int FindGreatestSumOfSubArray(int[] array) {
		int sum = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i-1] > 0) {
				array[i] += array[i - 1];
			} 
			sum = Math.max(sum, array[i]);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] intarr = {-2,-1};
		MaxChildSum m = new MaxChildSum();
		System.out.println(m.FindGreatestSumOfSubArray(intarr));;
	}
}
