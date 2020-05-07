package com.sword.pra;

public class TreePra11 {

    /**
     * ����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ㣩�����ؽ��Ϊ���ƺ��������head����ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
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
        
        //�����¸��ڵ�
        RandomListNode currentNode = pHead;
        while(currentNode!=null) {
            RandomListNode copyNode = new RandomListNode(currentNode.label);
            RandomListNode nextNode = currentNode.next;
            currentNode.next = copyNode;
            copyNode.next = nextNode;
            currentNode = nextNode;
        }
        
        //����ramdon�ڵ�
        currentNode = pHead;
        while(currentNode!=null) {
            currentNode.next.random = currentNode.random==null?null:currentNode.random.next;
            currentNode = currentNode.next.next;
        }
        
        //���
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