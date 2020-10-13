package com.sword.array;

/**
 * ��Ŀ����������һ������Ϊn�����ӣ�����ֳ�m�Σ�m>1��,��m�εĳ˻���� ת������ѧ�ϵ�����������һ����n����n = a1 + a2 ... +am,
 * ��m>1���ڴ�������, s = a1 * a2 * ... * am�� s���
 * 
 * @author Eden.Chen
 *
 */
public class Solution3 {
    /**
     * @param len���ӵĳ���
     * @return
     */
    private  int cutRope(int target) {
	        // lenCut[i]��ʾ����Ϊi�������Ž� lenCut[3]�Ƚ�����
	        int lenCut[] = new int[target + 1];
	        lenCut[0] = 0;
	        lenCut[1] = 1;
	        lenCut[2] = 2;
	        lenCut[3] = 3;
	        //��ʼ����3�����3>1*2���䱾��ȷָ�Ĵ����Ԯ��ָ��3��Ĕ��֕r����5���Էֳ�2��3��3�Ͳ��^�m���·ָ���
	        if (target < 2) {
	            return 0;
	        } else if (target == 2) {
	            return 1;
	        } else if (target == 3) {
	            return 2;
	        } else {
	            for (int i = 4; i <= target; i++) {
	            	int max = 0;
	                for (int j = 1; j <= i / 2; j++) {
	                	int temp = lenCut[j] * lenCut[i - j];
	                    if (max < temp) {
	                        max = temp;
	                    }
	                }
	                lenCut[i] = max;
	            }
	        }
	        return lenCut[target];
    }

}
