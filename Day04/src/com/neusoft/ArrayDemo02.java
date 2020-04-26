package com.neusoft;

/**
 * @author Liu
 * @date 2020/4/26 14:23
 */
public class ArrayDemo02 {
    public static void main(String[] args) {
        //两个变量指向同一个数组

        //1.定义数组
        int[] arr = new int[3];
        // 2.对数组进行赋值操作
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 6;
        }
        // 3.赋值
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //4.定义数组变量 arr2 将arr的地址赋值给arr2
        int[] arr2 = arr;
        // 5.修改arr2的第二个元素为8
        arr2[1] = 8;
        System.out.println(arr[1]);

        // 数组越界 两种可能：数组下标越界超出范围；数组中没有空间 （空数组）
        // System.out.println(arr[3]);

        // 数组的空指针异常
        // 意味着arr将不会保存数组的地址了，也就是不允许在操作数组了
       //  arr = null;  // java.lang.NullPointerException
      //   System.out.println(arr[0]);

        //数组的遍历 遍历arr2
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }





    }
}
