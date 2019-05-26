package com.github7;
/*
   Author:linrui
   Date:2019/5/23
   Content:
   输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。
   例如，输入”They are students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”
*/

import java.util.Scanner;

public class DeleteSameStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            delete(str1, str2);
        }
    }
    public static void delete(String str1,String str2){
        char[] ch=str1.toCharArray();
        for(int i=0;i<ch.length;i++){
            //遍历数组的每一个，如果在String里面没有这个，则进行打印
            if(!  str2.contains(String.valueOf(ch[i]))){
                System.out.println(ch[i]);
            }
        }
    }


}
