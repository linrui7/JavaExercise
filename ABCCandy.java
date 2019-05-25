package com.github7;
/*
   Author:linrui
   Date:2019/5/25
   Content:
   A,B,C三个人是好朋友,每个人手里都有一些糖果,我们不知道他们每个人手上具体有多少个糖果,
   但是我们知道以下的信息：A - B, B - C, A + B, B + C. 这四个数值.
   每个字母代表每个人所拥有的糖果数.现在需要通过这四个数值计算出每个人手里有多少个糖果,即A,B,C。
   这里保证最多只有一组整数A,B,C满足所有题设条件。

*/

import java.util.Scanner;

public class ABCCandy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int ajb = scanner.nextInt();
            int bjc = scanner.nextInt();
            int ahb = scanner.nextInt();
            int bhc = scanner.nextInt();
            print(ajb, bjc, ahb, bhc);
        }
    }

    public static void print(int num1, int num2, int num3, int num4) {
        int A1 = 0;
        int B1 = 0;
        int B2 = 0;
        int C1 = 0;

        //A-B  B-C  A+B  B+C
        //2A=num1+num3;
        //2B=num2+num4;
        //C=num4-B;
        A1 = (num1 + num3) / 2;
        B1 = (num2 + num4) / 2;
        B2 = (num3 - num1) / 2;
        C1 = (num4 - num2) / 2;

        if (B1 != B2) {
            System.out.println("No");
        } else {
            System.out.println(A1 + " " + B1 + " " + C1);
        }
    }
}
