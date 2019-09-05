/*
   Author:linrui
   Date:2019/9/4
   Content:输入半径为整数的R的圆，求完整的正方形1*1小方块儿
*/

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int r=scanner.nextInt();
        print(r);
    }

    private static void print(int r) {
        int count=0;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r;j++){
                if((i*i+j*j)<r*r){
                    count++;
                }
            }
        }
        System.out.println(count*4);
    }

}
