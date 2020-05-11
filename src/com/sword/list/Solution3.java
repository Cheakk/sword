package com.sword.list;

/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
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
        //如果当前节点重复
        if(pHead.val == pHead.next.val) {
            ListNode node = pHead.next;
            while(node!=null&&node.val == pHead.val) {
                node = node.next;
            }
            return deleteDuplication(node);
            //跳过这个节点，开始下个节点
        }else {
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }

    }
}
