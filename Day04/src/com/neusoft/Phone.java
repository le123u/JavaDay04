package com.neusoft;

/**
 * @author Liu
 * @date 2020/4/26 19:14
 */
public class Phone {
    // 品牌 、 价格 、 颜色
    String pinpai;
    int price;
    String color;
    String name;

    // 方法：给某人打电话
    public void Call(){
        System.out.println("给"+name+"打电话");
    }
    // 发短信
    public void Send(){
        System.out.println("给"+name+"发短信");
    }
}
