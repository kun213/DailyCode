package com.lk.day02.polymorphism03;
/**
 * 多态扩展性的体现
 *   父类 = new 子类()
 *
 *  扩展性: 父类 = new 子类可以随意变换();
 *          调用方法,执行子类的方法重写
 */
public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        animal = new Dog();
        animal.eat();

    }
}
