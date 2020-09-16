package com.lk.day01.extend02;
/**
 *  继承后： 子类和父类中，成员变量特点
 *
 *  特点： 如果子类中存在变量，使用子类的
 *         如果子类中没有变量，使用父类的
 *
 *   关键字 super 专门调用父类的成员
 *
 *   this :  区分局部变量和成员变量的同名 this.变量 （成员）
 *           this 代表当前对象，哪个对象调用的，就表示哪个对象
 *
 *   super:  专门调用父类的成员
 *            super代码父类在内存中的存储位置
 */
public class Zi extends Fu {
    int a = 5;
    public void show(){
        int a = 6;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}
