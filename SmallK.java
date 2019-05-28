package com.Bgithub7;
/*
   Author:linrui
   Date:2019/5/28
   Content:求一组数中，最小的k个，生序输出
   输入 1 3 5 8 6 2   其中2表示最小的前2个
   输出 1 3
*/

import java.util.Scanner;
public class SmallK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        while (scanner.hasNext()) {
            str = scanner.nextLine();
            smallk(str);
        }
    }

    public static void smallk(String str) {

        //将输入的字符串数组转化为int数组
        String[] strings = str.split(" ");
        int[] arr = new int[strings.length - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(strings[i]);
        }
        int k = Integer.valueOf(strings[strings.length-1]);

        //进行排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = 0;
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for(int i=0;i<k-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(arr[k-1]);
    }
}
