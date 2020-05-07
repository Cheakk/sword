package com.sword.pra;

public class Pra6 {

    static class ListNode {

        int val;

        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindKthToTail(ListNode head, int k) {
        ListNode p, pre;
        p = head;
        pre = head;
        int m = k;
        int count = 0;
        while (p != null) {
            p = p.next;
            count++;
            if (m < 1) {
                pre = pre.next;
            }
            m--;
        }
        if (count < k) {
            return null;
        }
        return pre;
    }
}