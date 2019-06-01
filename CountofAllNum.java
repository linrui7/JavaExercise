package com.Bgithub7;
/*
   Author:linrui
   Date:2019/6/1
   Content:
        给定一个k位整数N = d k-1 * 10 k-1 + ... + d 1 * 10 1 + d 0（0 <= d i <= 9，i = 0，...，k- 1，d k-1 > 0），请编写程序统计每种不同的个位数字出现的次数。
        例如：给定N = 100311，则有2个0,3个1，和1个3。

        输入描述：
        每个输入包含1个测试用例，即一个不超过1000位的正整数N.

        输出描述：
        对Ñ中每一种不同的个位数字，以d：M的格式在一行中输出该位数字d及其在Ñ中出现的次数M.要求按d的升序输出。
        示例1
        输入
        100311
        输出
        0：2
        1：3
        3：1
*/

import java.util.*;

public class CountofAllNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            count(str);
        }
    }

    public static void count(String str) {
        int[] a = new int[10];
        String n = str;
        //如果遇到数值将下标中的值++
        for (int i = 0; i < n.length(); i++) {
            a[n.charAt(i) - '0']++;
        }
        //如果遇到下标中的数不为0；输出
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                System.out.println(i + ":" + a[i]);
            }
        }
    }
}
