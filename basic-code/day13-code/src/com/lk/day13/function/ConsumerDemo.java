package com.lk.day13.function;

import java.util.function.Consumer;
/**
 * 函数式接口 java.util.function.Consumer<T>  消费
 * 接口的抽象方法 void accept(T t)
 * 消费:
 *   Consumer<String>
 *          void accept(String t)
 *          输出长度,切割,截取
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        // System.out.println("正常调用------");
       /* MyConsumer mc = new MyConsumer();
        acceptString(mc,"你好");*/

       /* System.out.println("匿名内部类------");
        acceptString(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        },"你好");
    }*/
/**
 * lambda改进实现类
 * 带参数
 * s 参数传递到方法中,方法accept()方法,接口重写方法
 * 接口方法accept,lambda中 {}
 */
        System.out.println("Lambda------");
       acceptString((String s)->{System.out.println(s);},"你好呀");
    }

    public static void acceptString(Consumer<String> consumer,String str){
        consumer.accept(str);

    }
}
/*class MyConsumer implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}*/
