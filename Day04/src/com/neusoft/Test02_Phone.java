package com.neusoft;

/**
 * @author Liu
 * @date 2020/4/26 18:57
 */
public class Test02_Phone {
    public static void main(String[] args) {
        // 创建对象
        Phone phone = new Phone();

        // 输出成员变量
        System.out.println("品牌"+phone.pinpai);
        System.out.println("价格"+phone.price);
        System.out.println("颜色"+phone.color);
        System.out.println("姓名"+phone.name);

        // 赋值
        phone.pinpai = "iphone";
        phone.price = 5000;
        phone.color = "green";
        phone.name = "猪八戒";

        // 再次输出
        System.out.println("品牌"+phone.pinpai);
        System.out.println("价格"+phone.price);
        System.out.println("颜色"+phone.color);
        System.out.println("姓名"+phone.name);

        // 调用打电话方法
        phone.Call();

        // 调用发短信方法
        phone.Send();
    }
  }


