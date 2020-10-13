package com.sword.array;

/**
 * 题目描述：给定一个长度为n的绳子，将其分成m段（m>1）,求m段的乘积最大。 转化成数学上的描述：给定一个数n，求n = a1 + a2 ... +am,
 * （m>1）在此条件下, s = a1 * a2 * ... * am， s最大
 * 
 * @author Eden.Chen
 *
 */
public class Solution3 {
    /**
     * @param len绳子的长度
     * @return
     */
    private  int cutRope(int target) {
	        // lenCut[i]表示长度为i个的最优解 lenCut[3]比较特殊
	        int lenCut[] = new int[target + 1];
	        lenCut[0] = 0;
	        lenCut[1] = 1;
	        lenCut[2] = 2;
	        lenCut[3] = 3;
	        //初始化到3是因為3>1*2，其本身比分割的大，所以當分割比3大的數字時候，如5可以分成2，3，3就不繼續往下分割了
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
