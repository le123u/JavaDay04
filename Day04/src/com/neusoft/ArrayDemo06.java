package com.neusoft;

/**
 * @author Liu
 * @date 2020/4/26 14:23
 */
public class ArrayDemo06 {
    public static void main(String[] args) {
        // 数组作为方法的返回值进行传递
        int[] arr = getArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }

    public static int[] getArray()  {
        int[] arr = {1,2,3,4,5};
        // 返回数组的地址  返回给调用者
        return arr;

    }

}