package com.lk.day01.abstract01;
/**
 * 牢记：
 *  抽象: 讲不清楚,抽象概念
 *  动物吃什么
 *
 *  抽象类的使用方式:
 *   1. 抽象类不能实例化对象,不能new
 *   2. 需要定义子类继承抽象类
 *   3. 子类必须重写抽象方法
 *      去掉abstract修饰,添加方法主体{}
 *   4. 创建子类的对象
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        System.out.println("-------------------");
        Dog dog = new Dog();
        dog.eat();
    }
}
