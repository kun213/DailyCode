package com.lk.day02.polymorphism06;
/**
 * 笔记本案例进行测试,创建对象,调用方法
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.openOn();
        computer.closeOff();
        //调用笔记本的方法,使用USB接口的方法
        //传递参数,方法中的参数是USB接口,接口没有对象,只能传递实现类对象
        computer.userUSB(new Mouse());
        System.out.println("----------------");
        //再次调用useUSB方法,传递另一个接口实现类,键盘
        computer.userUSB(new KeyBoard());
    }
}
