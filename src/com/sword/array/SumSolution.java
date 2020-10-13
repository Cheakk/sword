package com.sword.array;

import java.util.ArrayList;
import java.util.HashSet;

public class SumSolution {
	public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		// �߽�����
		if (array == null || array.length <= 1) {
			return result;
		}
		int smallIndex = 0;
		int bigIndex = array.length - 1;
		while (smallIndex < bigIndex) {
			// �����ȾͷŽ�ȥ
			if ((array[smallIndex] + array[bigIndex]) == sum) {
				result.add(array[smallIndex]);
				result.add(array[bigIndex]);
				// �����ĳ˻���С������Ŀ��
				break;
			} else if ((array[smallIndex] + array[bigIndex]) < sum) {
				smallIndex++;
			} else {
				bigIndex--;
			}
		}
		return result;
	}
	
    // hash��
	public int[] FindNumbersWithSum2(int[] nums, int target) {
	    HashSet<Integer> set = new HashSet<>();
	    for(int num : nums){
	        set.add(num);
	    }
	    for(int num : nums){
	        int e = target - num;
	        if(set.contains(e)){
	            return new int[]{num,e};
	        }
	    }
		return nums;
	}


}
