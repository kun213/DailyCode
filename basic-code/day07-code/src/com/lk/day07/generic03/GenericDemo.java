package com.lk.day07.generic03;
       /**
        * 自定义的带有泛型的方法
        */
public class GenericDemo {
    public static void main(String[] args) {
        Factory<String> factory = new Factory<String>();
        factory.add("你好");
        factory.show(12);
        Factory.function("ss");
    }

}
