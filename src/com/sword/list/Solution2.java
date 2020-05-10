package com.sword.list;

/**
 * ��һ�����������а����������ҳ�������Ļ�����ڽ�㣬�������null��
 * 
 * @author Administrator
 *
 */
public class Solution2 {
	public ListNode EntryNodeOfLoop(ListNode pHead) {
		// ���ÿ��������ڵ㣬����������
		ListNode fast = pHead;
		ListNode low = pHead;
		// �ҳ�������
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

		// ��������������ʼ�Ľڵ��������������ڻ������
		low = pHead;
		while (low!=fast) {
			low = low.next;
			fast = fast.next;
		}
		return low;
	}
}
