package com.lk.day02.polymorphism04;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼1");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠！");
    }
}
