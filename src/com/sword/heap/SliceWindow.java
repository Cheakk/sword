package com.sword.heap;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class SliceWindow {
	public ArrayList<Integer> maxSlidingWindow(int[] nums, int k) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (nums.length == 0 || k == 0)
			return result;
		Deque<Integer> deque = new LinkedList<>();
		for (int j = 0, i = 1 - k; j < nums.length; i++, j++) {
			if (i > 0 && deque.peekFirst() == nums[i - 1])
				deque.removeFirst(); // 删除 deque 中对应的 nums[i-1]
			while (!deque.isEmpty() && deque.peekLast() < nums[j])
				deque.removeLast(); // 保持 deque 递减
			deque.addLast(nums[j]);
			if (i >= 0)
				result.add(deque.peekFirst()); // 记录窗口最大值
		}
		return result;
	}
}
