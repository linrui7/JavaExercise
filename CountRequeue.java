package com.github7;
/*
   Author:linrui
   Date:2019/5/20
   Content:给定一个数组，如果前一个数比后面数大，则是一个逆序对，试分析一共有多少逆序对。
*/

public class CountRequeue {
    public static void main(String[] args) {
        CountRequeue countRequeue = new CountRequeue();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 0};
        System.out.println(countRequeue.count(arr, 8));
    }

    public int count(int[] A, int n) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[i] > A[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
