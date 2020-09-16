package com.lk.day02.interface04;
/**
 * D类实现C接口,重写C接口,和C的父接口中的所有抽象方法
 */
public class D implements C {
    public void a(){
        System.out.println("a的重写方法");
    }
    public void b(){
        System.out.println("b的重写方法");
    }
    public void c(){
        System.out.println("c的重写方法");
    }
}
