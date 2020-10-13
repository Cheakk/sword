package com.sword.string;

import java.util.LinkedList;
import java.util.Queue;
/**
 * 
 * ��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ������磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ��
 * ��һ��ֻ����һ�ε��ַ���"g"�����Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
 * @author Administrator
 *
 */
public class FirstRepeatString {
    int[] charCnt = new int[128];
    Queue<Character> queue = new LinkedList<Character>();
 
    //Insert one char from stringstream
    public void Insert(char ch) {
        if (charCnt[ch]++ == 0) //�����ĵ����ַ������
            queue.add(ch);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        Character CHAR = null;
        char c = 0;
        while ((CHAR = queue.peek()) != null) {
            c = CHAR.charValue();
            if (charCnt[c] == 1) //�ж��Ƿ��ѵ��ˣ�û�ѵ������
                return c;
            else queue.remove(); //�ѵ��˾��Ƴ����У��������ٻ�����
        }
        return '#'; //�ӿգ�����#
    }
}
