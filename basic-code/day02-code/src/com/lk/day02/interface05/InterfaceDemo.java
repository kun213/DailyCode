package com.lk.day02.interface05;
/**
 *  一类在继承一个类的同时,实现多个接口
 *  ArrayList已经体现
 *  子类重写父类的抽象方法,重写接口的抽象方法, 子类他很累
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        D d = new D();
        d.a();
        d.b();
        d.c();
    }
}
