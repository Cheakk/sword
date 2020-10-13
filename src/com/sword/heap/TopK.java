package com.sword.heap;

import java.util.PriorityQueue;

public class TopK {
	
	 public int[] smallestK(int[] arr, int k) {
		 int[] result = new int[k];
		 PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		 for(int i = 0 ; i <arr.length ;i++) {
			 que.add(arr[i]);
		 }
		 for (int i = 0;i<k;i++) {
			 result[i] = que.poll();
		 }
		 return result;
	    }

}
