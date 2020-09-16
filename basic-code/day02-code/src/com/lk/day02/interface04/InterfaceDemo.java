package com.lk.day02.interface04;
/**
 *  类和类之间是继承关系,单继承
 *  类和接口之间是实现关系,多实现
 *  接口和接口之间是继承关系,接口支持多继承
 *    一个接口,可以同时继承多个接口
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        D d = new D();
        d.a();
        d.b();
        d.c();
    }
}
