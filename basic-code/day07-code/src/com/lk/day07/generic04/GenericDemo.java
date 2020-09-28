package com.lk.day07.generic04;
/**
 * 自定义带有泛型的接口
 * 接口必须有实现类才能使用
 * 1: 实现类实现接口,但是不明确泛型
 * 2: 实现类实现接口,同时明确泛型
 */
public class GenericDemo {
    public static void main(String[] args) {
      InterFaceImpl<String> inter = new InterFaceImpl<String>();
      inter.show("你好");

      InterFaceImpl01 interFaceImpl01 = new InterFaceImpl01();
      interFaceImpl01.show(565);
    }
}
