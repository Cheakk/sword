package com.sword.list;

/**
 * ��һ������������У������ظ��Ľ�㣬��ɾ�����������ظ��Ľ�㣬�ظ��Ľ�㲻��������������ͷָ�롣 ���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5
 * 
 * @author Administrator
 *
 */
public class Solution3 {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null || pHead.next==null) {
            return pHead;
        }
        //�����ǰ�ڵ��ظ�
        if(pHead.val == pHead.next.val) {
            ListNode node = pHead.next;
            while(node!=null&&node.val == pHead.val) {
                node = node.next;
            }
            return deleteDuplication(node);
            //��������ڵ㣬��ʼ�¸��ڵ�
        }else {
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }

    }
}
