package com.neusoft;

/**
 * @author Liu
 * @date 2020/4/26 18:57
 */
public class Test02_Phone {
    public static void main(String[] args) {
        // 创建对象
        Phone phone = new Phone();
//        Phone p2 = new Phone();

        // 输出成员变量
//        System.out.println("品牌"+phone.pinpai);
//        System.out.println("价格"+phone.price);
//        System.out.println("颜色"+phone.color);

        // 赋值
        phone.pinpai = "iphone";
        phone.price = 5000;
        phone.color = "green";
        show(phone);

//        p2.pinpai = "iphone12";
//        p2.price = 5000;
//        p2.color = "red";


        // 再次输出
//        System.out.println("品牌"+phone.pinpai);
//        System.out.println("价格"+phone.price);
//        System.out.println("颜色"+phone.color);
//

//        // 调用打电话方法
//        phone.Call();
//
//        // 调用发短信方法
//        phone.Send();
    }
    // 对象作为参数进行传递
    public static void show(Phone p){
        System.out.println(p.pinpai + p.color + p.price);

    }
  }


