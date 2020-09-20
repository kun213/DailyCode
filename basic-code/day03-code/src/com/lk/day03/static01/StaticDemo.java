package com.lk.day03.static01;
/**
 * static修饰符,静态
 * 主方法就是静态修饰
 * 方法的定义,加上static
 *
 * 静态的成员,多了一种调用方式
 * 类名.静态成员
 *
 * 非静态成员只能被对象调用
 * 静态成员可以被类名调用,也能被对象调用
 * 强制使用类名调用
 */
public class StaticDemo {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name = "张三";
        stu1.age = 15;
        System.out.println(stu1.school);

    }
}
