package com.lk.day02.polymorphism04;
/**
 * 猫狗案例
 *   多态的好处: 无限的扩展他的子类
 *   多态的弊端: 只能调用子类和父类的共性内容,不能调用子类的特有内容!
 *   原因:多态编译看父类造成
 *
 *  多态的转型
 */
public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal animal = new Cat();//自动转换 向上转型，子类提升为父类
        animal.eat();
        //调用子类特有方法
        //进行类型的强制转换，将animal类型转换成Cat类型
        Cat cat = (Cat)(animal);//强制转换 向下转型，父类转换回成子类类型
        cat.catchMouse();
    }
}
