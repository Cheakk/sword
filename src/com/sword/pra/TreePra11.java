package com.sword.pra;

public class TreePra11 {

    /**
     * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
     * 
     * @author Eden.Chen
     *
     */
    static class RandomListNode {

        int label;

        RandomListNode next = null;

        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode Clone(RandomListNode pHead) {
        if(pHead == null) {
            return null;
        }
        
        //复制下个节点
        RandomListNode currentNode = pHead;
        while(currentNode!=null) {
            RandomListNode copyNode = new RandomListNode(currentNode.label);
            RandomListNode nextNode = currentNode.next;
            currentNode.next = copyNode;
            copyNode.next = nextNode;
            currentNode = nextNode;
        }
        
        //复制ramdon节点
        currentNode = pHead;
        while(currentNode!=null) {
            currentNode.next.random = currentNode.random==null?null:currentNode.random.next;
            currentNode = currentNode.next.next;
        }
        
        //拆分
        currentNode = pHead;
        RandomListNode pCloneHead = pHead.next;
        while(currentNode!=null) {
            RandomListNode cloneNode = currentNode.next;
            currentNode.next = cloneNode.next;
            cloneNode.next = cloneNode.next==null?null:cloneNode.next.next;
            currentNode = currentNode.next;
        }
        
        return pCloneHead;
    }

    public static void main(String[] args) {
        RandomListNode node = new RandomListNode(0);
        RandomListNode node1 = new RandomListNode(1);
        RandomListNode node2 = new RandomListNode(2);
        node.next = node1;
        node.random = node2;
        TreePra11 t = new TreePra11();
        t.Clone(node);
        System.out.println("1");
    }
}