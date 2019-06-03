package com.Bgithub7;
/*
   Author:linrui
   Date:2019/5/29
   Content:
   输入一个正整数n,求n!(即阶乘)末尾有多少个0？ 比如: n = 10; n! = 3628800,所以答案为2
*/

import java.util.Scanner;

public class NLastNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if(x>0){
            lastZeroNum(x);
            }else{
                System.out.println(0);
            }
        }
    }
    public static void lastZeroNum(int x){
       int result= lastZero(x);
       int num=0;
       while (result%10==0&&result>0){
           num++;
           result=result/10;
       }
        System.out.println(num);
    }
    public static int  lastZero(int x){
        if(x==1){
            return 1;
        }else{
            return x*lastZero(x-1);
        }
    }

    /*n的阶乘时，实际上就是把所有小于等于n的正整数分解成质因数，然后再将其乘到一起，那
    么末尾0的个数实际上就是2*5的个数，而2的个数明显是很多很多的，所以问题就转化成了5的个数。
    而只有5的倍数才有5这个因数，所以，问题就进一步简化为小于等于n的数中有多少个数是5的倍数，当然25
    的倍数，125的倍数，625还要单独考虑。*/
    public void code(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for(int i = n; i >= 5; i--) {
            int tmp = i;
            while(tmp % 5 == 0) {
                res++;
                tmp /= 5;
            }
        }
        System.out.println(res);
    }
}
