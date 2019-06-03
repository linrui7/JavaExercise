package com.Bgithub7;
/*
   Author:linrui
   Date:2019/6/3
   Content:
   链接：https://www.nowcoder.com/questionTerminal/17517002460f453eb97a73439fc10ec8
        现在有一个字符串，你要对这个字符串进行n次操作，
        每次操作给出两个数字：（p，l）表示当前字符串中从下标为p的字符开始的长度为l的一个子串。
        你要将这个子串左右翻转后插在这个子串原来位置的正后方，求最后得到的字符串是什么。
        字符串的下标是从0开始的，你可以从样例中得到更多信息。

        输入描述：
        每组测试用例仅包含一组数据，每组数据第一行为原字符串，长度不超过10，仅包含大小写字符与数字。
        接下来会有一个数字n表示有n个操作，
        再接下来有n行，每行两个整数，表示每次操作的（p，l）。
        保证输入的操作一定合法，最后得到的字符串长度不超过1000。

        输出描述：
        输出一个字符串代表最后得到的字符串。

        示例1
        输入
        AB
        2
        0 2
        1 3
        输出
        abbaabb
    思路：将字符串中的两个相邻位置子串交换，例如将abc123位置交换可以这样做：
    首先将 abc反转,变成cba123,再将123反转，变成cba321,最后，将整个子串反转，即变为123abc.
    十分方便！（AB--A'B---A'B'---BA）
    本题可以采用上述思路，将反转之后的子串接在整个串后面，再将子串进行反转交换就可以得到结果。
*/

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            int n = scanner.nextInt();
            System.out.println(solve(str, n, scanner));
        }
    }

    public static String solve(String str, int n, Scanner scanner) {
        //n 表示将要进行几次操作用for循环控制
        for(int i=0;i<n;i++){
            //此时输入两个数 表示p进行反转 反转长度为len
            int p=scanner.nextInt();
            int len=scanner.nextInt();
            //进行反转
            // ab 0 2  1 3
            //ab ba     abba abb
            //前面的部分+反转的部分
            String A=str.substring(0,p+len);
            //反转的部分
            String B=str.substring(p,p+len);
            //后面的部分
            String C=str.substring(p+len,str.length());
            //创建可变数组，添加原来的和反转之后的
            StringBuffer stringBuffer=new StringBuffer();
            stringBuffer.append(A);
            //反转B,并追加到后面去
            StringBuffer stringBuffer1=new StringBuffer(B);
            stringBuffer.append(stringBuffer1.reverse());
            stringBuffer.append(C);
            str=str.toString();
        }
        return str;
    }

}
