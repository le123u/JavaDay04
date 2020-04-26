package com.neusoft;

/**
 * @author Liu
 * @date 2020/4/26 18:57
 */
public class Test01_Student {
  // 类的使用
    // Java中通过创建对象去使用类
    // 格式：
    // 类名  对象名 = new 类名（）
    // 返回值类型 具体的对象的名字 = new 类（）
    // 我们通过对象去访问类中的成员
    // 格式：
    // 对象名.成员变量
    // 对象名.成员方法（）；
  public static void main(String[] args) {
      // 调用学生类
      // 1.创建类 类名  对象名 = new 类名（）
      Student stu = new Student();
      // 2.打印这个对象
      System.out.println(stu); // 包名+地址：com.neusoft.Student@1b6d3586
      // 3.访问其中的成员变量
      System.out.println("姓名"+stu.name);
      System.out.println("年龄"+stu.age);

      // 4.给成员变量进行赋值
      stu.name = "寻悟空";
      stu.age = 23;

      //5.再次输出变量
      System.out.println("姓名"+stu.name);
      System.out.println("年龄"+stu.age);

      // 6.调用成员方法
      stu.study();
      stu.eat();

  }

}
