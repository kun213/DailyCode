package com.lk.day13.function;

import java.util.function.Supplier;
/**
 *  JDK8接口 Supplier
 *  java.util.function.Supplier "供给"
 *  只有一个抽象方法 get() 带泛型,和接口一致
 */
public class SupplierDemo {
    public static void main(String[] args) {

       /*  System.out.println("正常调用-------");
       MySupplier mySupplier = new MySupplier();
        String string = getString(mySupplier);
        System.out.println(string);*/

       /* System.out.println("匿名内部类------");
       String string = getString(new Supplier<String>() {
            @Override
            public String get() {
                return "hello";
            }
        });
        System.out.println(string);*/

        System.out.println("Lambda------");
        String string = getString(() -> "hello");
        System.out.println(string);
    }

    public static String getString(Supplier<String> supplier){
        String s = supplier.get();
        return s;
    }
}
/*class MySupplier implements Supplier<String>{

    @Override
    public String get() {
        return "hello";
    }
}*/

