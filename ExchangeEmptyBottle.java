package com.github7;
/*
   Author:linrui
   Date:2019/5/20
   Content:
   "三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？"
   答案是5瓶，方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，
   喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。
   然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。
   如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？ 
*/

import java.util.Scanner;

public class ExchangeEmptyBottle {
    static public int exchange(int empty) {
        int full=0 ;
       //如果多余3个空瓶可以一直兑换，直到空瓶数小于3
        while(empty>=3){
            if(empty%3==0){
                full=full+empty/3;
                empty=empty/3;
            }
            if(empty%3!=0){
                full=full+empty/3;
                empty=empty%3+empty/3;
            }
        }
        if (empty == 2) {
            return full + 1;
        }
        if (empty < 2) {
            return full + 0;
        }
        return full;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (num != 0) {
                System.out.println(exchange(num));
            }
        }
    }

}
