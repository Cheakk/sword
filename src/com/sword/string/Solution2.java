package com.sword.string;

/**
 * 
 */
public class Solution2 {
    int[] hashTable = new int[256];//��Ϊ����ַ�����8λ��ɣ�����������������256��
    StringBuffer buffer = new StringBuffer();
    public void Insert(char ch)
    {
        buffer.append(ch);
        if(hashTable[ch] == 0){
            hashTable[ch] = 1;
        }else{
            hashTable[ch] = hashTable[ch] + 1;
        }
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char[] temp = buffer.toString().toCharArray();
        for(char ch: temp){
            if(hashTable[ch] == 1){
                return ch;
            }
        }
        return '#';
    }
    
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        s.Insert('d');
        s.Insert('d');
        s.Insert('d');
        s.Insert('f');
        s.Insert('d');
        s.Insert('d');
        s.Insert('d');
        System.out.println(s.FirstAppearingOnce());
    }
}
