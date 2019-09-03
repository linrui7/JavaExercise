/*
   Author:linrui
   Date:2019/9/3
   Content:
*/

import java.text.DecimalFormat;
public class TT {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int n = 3;
        Main(arr, n);
    }

    private static void Main(int[] arr, int n) {
        if (n > arr.length) {
            return;
        } else {
            int[] extra = new int[arr.length - n+1];
            for (int i = 0; i < extra.length; i++) {
                int sum = 0;
                for (int j = i; j < i + n; j++) {
                    sum += arr[j];
                }
                extra[i] = sum / n;
            }
            for (int i = 0; i < extra.length-1; i++) {
                DecimalFormat df = new DecimalFormat("#0.00");
                float data;
                data = extra[i];
                System.out.print(df.format(data)+" ");
            }
            DecimalFormat df = new DecimalFormat("#0.00");
            float data;
            data = extra[extra.length-1];
            System.out.print(df.format(data));
        }
    }
}