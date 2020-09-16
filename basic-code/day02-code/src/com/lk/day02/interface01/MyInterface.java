package com.lk.day02.interface01;
/**
 * 接口: 在Java中是一种标准规则
 * 在成员中全部定义抽象方法
 * 当一个类中,所有的方法全是抽象方法的时候,将这个类定义为一个更加
 * 贴切的定义,称为他接口. 理解为: 全部是抽象方法的类 (特殊的抽象类)
 *
 * 接口: 定义的关键字 interface
 *
 * 定义类class,编译完成是.class文件
 * 定义接口interface,编译完成后是.class文件
 */

/**
 *  JDK1.7及以前版本的接口定义
 *  接口成员:
 *    成员变量 : 固定修饰符  public static final  数据类型 变量名 = 值; (常量)
 *    成员方法 : 固定修饰符  public abstract 返回值 方法名(参数列表);
 *
 *  接口中成员固定修饰符, 可以不写,但是你写和不写没有区别
 *  javac编译,检测成员修饰符,如果不写, javac帮你写
 */
public interface MyInterface {
    public static final int A = 1;
    public abstract void show();
}
