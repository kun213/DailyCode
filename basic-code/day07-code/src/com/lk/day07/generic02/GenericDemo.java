package com.lk.day07.generic02;
/**
 * 泛型使用,自定义带有泛型的类
 *   public class ArrayList<E>{
 *
 *       public boolean add(E e){}
 *   }
 */
public class GenericDemo {
    public static void main(String[] args) {
        Factory<String> factory = new Factory<String>();
        factory.add("你好！");

        factory.setName("你话！");
        String str = factory.getName();
        System.out.println(str);
    }
}
