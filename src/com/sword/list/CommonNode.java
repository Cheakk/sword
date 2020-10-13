package com.sword.list;

public class CommonNode {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		if (pHead1 == null || pHead2 == null) {
			return null;
		}
		ListNode index1 = pHead1;
		ListNode index2 = pHead2;
		while (index1 != index2) {
			index1 = index1.next;
			index2 = index2.next;
			if (index1 != index2) {
				if (index1 == null)
					index1 = pHead2;
				if (index2 == null)
					index2 = pHead1;
			}
		}
		return index1;
	}

}
