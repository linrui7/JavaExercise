package com.github7;
/*
   Author:linrui
   Date:2019/5/20
   Content:统计回文
   给定两个字符串A和B，试统计出，把B插入到A当中有多少种能让A变成回文的方法
*/

import java.util.Scanner;

public class CountPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.next();
            String b = in.next();
            System.out.println(count(a, b));
        }
    }

    static public int count(String a, String b) {
        int count = 0;
        //将b插入到a当中
        for (int i = 0; i <= a.length(); i++) {
            String string = a.substring(0, i) + b + a.substring(i, a.length());
            if (isPalindrome(string) == 1) {
                count++;
            }
        }
        return count;
    }


    static int isPalindrome(String string) {
        //判断是否是回文,双指针便利法
        int i = 0;
        int j = string.length() - 1;
        while (i < j) {
            if (string.charAt(i++) != string.charAt(j--)) {
                return 0;
            }
        }
        return 1;
    }

}
