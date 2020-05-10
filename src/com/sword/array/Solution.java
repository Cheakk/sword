package com.sword.array;

/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
 * 不能使用除法。（注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... *
 * A[n-2];）
 * 
 * @author Eden.Chen
 *
 */
public class Solution {

    public int[] multiply(int[] A) {
        int size = A.length;
        int[] B = new int[size];
        if (A == null || size == 0) {
            return B;
        }
        for (int i = 1; i < A.length; i++) {
            B[0] = 1;
            B[i] = B[i-1]*A[i - 1];
        }
        int temp = 1;
        for (int j = size - 2; j >= 0; j--) {
            temp *= A[j + 1];
            B[j] *= temp;
        }        
        return B;
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] sample = {1,2,3,4,5};
        s.multiply(sample);
    }
}
