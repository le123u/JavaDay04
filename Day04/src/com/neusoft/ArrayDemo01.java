package com.neusoft;

/**
 * @author Liu
 * @date 2020/4/26 14:23
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        //输出的是数组的地址值 一个十六进制的数 [I@1b6d3586
        int[] arr = new int[4];
        int[] arr2 = new int[3];
        System.out.println(arr);
        System.out.println(arr2);

    }
}
