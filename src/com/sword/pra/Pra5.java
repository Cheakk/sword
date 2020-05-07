package com.sword.pra;

public class Pra5 {

    public static void reOrderArray(int[] array) { 
        //ÆæÊıµÄÊı×Ö
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 1) {
                int j = i;
                //TODAY FOOL
                while (j > index) {  
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    j--;
                }
                index++;
            }
        }
    }
    
    public static void main(String[] args) {
        int[ ] aa =  {1,2,3,4,5};
        reOrderArray (aa);
        System.out.println();
    }
}