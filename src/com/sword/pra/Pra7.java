package com.sword.pra;

import java.util.Stack;

public class Pra7 {

    static class ListNode {

        int val;

        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        if (head == null) {
            return null;
        }
        while (head != null) {
            next = head.next;
            pre = head.next;
            pre = head;
            head = next;
        }
        return pre;
    }
}