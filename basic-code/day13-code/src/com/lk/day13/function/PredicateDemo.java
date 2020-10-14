package com.lk.day13.function;

import java.util.function.Predicate;
/**
 *  java.util.function.Predicate 接口
 *  抽象方法:
 *    Predicate<String>
 *    boolean test(String t);
 */
public class PredicateDemo {
    public static void main(String[] args) {
       /* System.out.println("方法调用-----------");
        boolean b = getBoolean(new MyPredicate(), "464654");
        System.out.println(b);
    }*/

        /*System.out.println("匿名内部类------------");
        boolean b = getBoolean(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()>5;
            }
        },"464646");
        System.out.println(b);
    }*/
        /**
         * lambda表达式,判断字符串长度是否大于5,返回true
         */
        System.out.println("Lambda----------");
       boolean b = getBoolean( s->s.length()>5,"46461231");
        System.out.println(b);
    }
    public static boolean getBoolean(Predicate<String> predicate,String s){
        return predicate.test(s);
    }
}

/*class MyPredicate implements Predicate<String>{
    @Override
    public boolean test(String s) {
        return s.length()<5;
    }
}*/
