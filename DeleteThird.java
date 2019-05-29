package com.Bgithub7;
/*
   Author:linrui
   Date:2019/5/28
   Content:
  有一个数组a[N]，要求每隔两个数删掉一个数，到末尾则又循环到开头继续进行
  求最后一个被删掉的数的原始下标位置

   例如，一个数组：{0, 1, 2, 3, 4, 5, 6, 7}
   0->1->2(第一遍，删除)->3->4->5(第一遍，删除)->6->7->
   0(第二遍，删除)->1->2(已删除)->3->4(第二遍，删除)->5(已删除)->6->7...
   循环直到数组中最后一个元素被删除
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if (x >= 999) {
                x = 999;
            }
            System.out.println(lastDeleteIndex(x));
        }
    }

    public static int lastDeleteIndex(int x) {
        //将所有的数都保存到List中
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            list.add(i);
        }
        //然后删除遇到的第三个数
        int i = 0;
        //因为每次删除的都是当前位置的后面第2个，那么我们就可以这样写：(i+2)%size; 当i==0的时候，
        //我们移除的就是2号下标，接着需要移除4号下标，那么新的i = (i+2)%size;
        while (list.size() > 1) {
            //删除2 4 6 8
            i = (i + 2) % list.size();
            list.remove(i);
        }
        return list.get(0);
    }
}
