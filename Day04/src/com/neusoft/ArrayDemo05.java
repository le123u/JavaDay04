package com.neusoft;

/**
 * @author Liu
 * @date 2020/4/26 14:23
 */
public class ArrayDemo05 {
    public static void main(String[] args) {
        // 数组作为方法的参数进行传递
        int[] arr = {1,3,5,7,9};
        printArray(arr);
    }
    //之前我们看到的方法都是基本数据类型作为参数
    // 使用数组作为方法的参数
//    public  static void printArray(形参 实参){
//
//    }
   // public  static void printArray(数据类型 变量值){
//
//    }
    public  static void printArray(int[] arr){
       // 想要打印出数组  我们可以使用for循环遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


   }

}