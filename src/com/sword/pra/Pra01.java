package com.sword.pra;


public class Pra01 {
    /*
     * 
     */
    
        public static boolean find(int [][] arr , int target) {
            int rows = arr.length;
            int columns = arr[0].length;
            
            
            
            int row = arr.length-1;
            int column = 0;
            int leftMax = arr[row][column];
            
            /**
             * ���¿�ʼ�� ���ڵ��� С��
             * 
             */
            while(row>=0&&column<columns) {
                
                if (leftMax > target) {
                    row--;
                    leftMax = arr[row][column];
                    System.out.println("��ǰ�Ĕ��֞�  "+leftMax);
                } else if (leftMax < target) {
                    column++;
                    leftMax = arr[row][column];
                } else {
                    return true;
                }         
                
            }
            
            return false;
            
        }
        
        public static void main(String[] args) {
            int [] [] arr = {{1,2,3},{1,2,3}};
            
            System.out.println("row = + " + find(arr,3));
        }
    
}
