package com.neusoft;

/**
 * @author Liu
 * @date 2020/4/26 14:23
 */
public class ArrayDemo04 {
    public static void main(String[] args) {
        // 对数组进行反转
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length/2; i++) {
            int exchange =  arr[i];
            arr[i] = arr[(arr.length) - 1 - i];
            arr[(arr.length) - 1 - i] = exchange;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



        int[] arr1 = {1,2,3,4,5};
        /**
         * for (初始化条件1，初始化条件2；循环条件；步进运算1，步进运算2)
         * 定义一个min = 0 最小索引值，max = arr.length - 1 最大索引值
         */
        for (int min = 0, max = arr.length - 1; min <= max; min++,max--) {
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;

        }
        //重新遍历反转数组
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }



   }
}
