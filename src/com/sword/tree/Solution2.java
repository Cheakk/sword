package com.sword.tree;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 
 * @author Administrator
 *         如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，
 *         那么中位数就是所有数值排序之后中间两个数的平均值。我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
 */
public class Solution2 {
	int count = 0;
	// 默认为小根堆
	private PriorityQueue<Integer> low = new PriorityQueue<Integer>();

	private PriorityQueue<Integer> hight = new PriorityQueue<Integer>(new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}
	});

	public void Insert(Integer num) {
		// 偶数
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
