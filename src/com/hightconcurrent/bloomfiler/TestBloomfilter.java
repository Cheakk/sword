package com.hightconcurrent.bloomfiler;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnel;
import com.google.common.hash.Funnels;

public class TestBloomfilter {
	private static int total = 1000000;
	private static BloomFilter<Integer> bf = BloomFilter.create(Funnels.integerFunnel(), total);
	
    public static void main(String[] args) {
        // ��ʼ��1000000�����ݵ���������
        for (int i = 0; i < total; i++) {
            bf.put(i);
        }

        // ƥ�����ڹ������е�ֵ���Ƿ���ƥ�䲻�ϵ�
        for (int i = 0; i < total; i++) {
            if (!bf.mightContain(i)) {
                System.out.println("�л���������~~~");
            }
        }

        // ƥ�䲻�ڹ������е�10000��ֵ���ж���ƥ�����
        int count = 0;
        for (int i = total; i < total + 10000; i++) {
            if (bf.mightContain(i)) {
                count++;
            }
        }
        System.out.println("���˵�������" + count);
        
        System.out.println(bf.mightContain(2000001));
        System.out.println(bf.mightContain(-1));
    }

	
}
