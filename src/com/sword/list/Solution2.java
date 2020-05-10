package com.sword.list;

/**
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 * 
 * @author Administrator
 *
 */
public class Solution2 {
	public ListNode EntryNodeOfLoop(ListNode pHead) {
		// 设置快慢两个节点，必有相遇点
		ListNode fast = pHead;
		ListNode low = pHead;
		// 找出相遇点
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			low = low.next;
			if (fast == low) {
				break;
			}
		}
		if (fast == null || fast.next == null) {
			return null;
		}

		// 由相遇点出发和最开始的节点出发，最后相遇在环的入口
		low = pHead;
		while (low!=fast) {
			low = low.next;
			fast = fast.next;
		}
		return low;
	}
}
