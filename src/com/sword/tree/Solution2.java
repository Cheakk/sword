package com.sword.tree;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 
 * @author Administrator
 *         ��εõ�һ���������е���λ����������������ж�����������ֵ����ô��λ������������ֵ����֮��λ���м����ֵ��������������ж���ż������ֵ��
 *         ��ô��λ������������ֵ����֮���м���������ƽ��ֵ������ʹ��Insert()������ȡ��������ʹ��GetMedian()������ȡ��ǰ��ȡ���ݵ���λ����
 */
public class Solution2 {
	int count = 0;
	// Ĭ��ΪС����
	private PriorityQueue<Integer> low = new PriorityQueue<Integer>();

	private PriorityQueue<Integer> hight = new PriorityQueue<Integer>(new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}
	});

	public void Insert(Integer num) {
		// ż��
		if (count % 2 == 0) {
			hight.add(num);
			low.add(hight.poll());
		} else {
			low.add(num);
			hight.add(low.poll());
		}
		count++;
	}

	public Double GetMedian() {

		if (count % 2 == 0) {
			return new Double((low.peek() + hight.peek())) / 2;
		} else {
			return new Double(low.peek());
		}

	}

}
