package com.Bgithub7;
/*
   Author:linrui
   Date:2019/6/1
   Content:
       给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
       其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
*/

import java.util.Scanner;

public class NewArray {
    public static void main(String[] args) {
        int arr[] = new int[10];
        multiply(arr);
    }

    public static int[] multiply(int[] A) {
        int length = A.length;
        int[] B = new int[length];
        if(length != 0 ){
            B[0] = 1;

            for(int i = 1; i < length; i++){
                B[i] = B[i-1] * A[i-1];
            }
            //当前B[i]的值应该为1
            int temp = 1;
            for(int i = length-2; i >= 0; i--){
                temp *= A[i+1];
                B[i] *= temp;
            }
        }
        return B;
    }
}
