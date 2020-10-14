package com.lk.day13.function;

import java.util.function.Function;
/**
 *  java.util.function.Function<T,R>接口
 *  抽象方法 R apply(T t);  参数是T类型,返回值是R
 *  传递的参数是T,返回值是R
 *  Functions<String,Integer> 方法参数是String,返回值是Integer
 */
public class FunctionInterfaceDemo {
    public static void main(String[] args) {
        /*System.out.println("方法调用-----------");
        Integer integer = applyInt(new MyFunction(), "4646");
        System.out.println(integer+464);*/

        /*System.out.println("方法匿名内部类------------");
       int num =  applyInt(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }, "646");
        System.out.println(num+11);
    }*/

        System.out.println("Lambda----------");
       int num = applyInt((String s)->{return Integer.parseInt(s);},"464");
        System.out.println(num+1);

        System.out.println("Lambda简化版------------");
        /**
         * 可推导可省略
         *       1: 方法体: 只有1行代码,{} 可以省略
         *       2: 方法依赖接口,明确返回int类型  return int;  可以省略return
         *       3: 方法参数
         *         sort(ist)集合排序 , list集合明确了存储的数据类型泛型  <Person>
         *             比较器接口Comparator,比较的对象也是Person
         *             参数类型可以省略
         */
        int num1 = applyInt(s->Integer.parseInt(s),"464");
        System.out.println(num+2);
    }


    public static Integer applyInt(Function<String,Integer> function,String s) {
        Integer apply = function.apply(s);
        return apply;
    }
}

/*//接口方法重写
class MyFunction implements Function<String,Integer>{

    @Override
    public Integer apply(String s) {
        return Integer.parseInt(s);
    }
}*/
