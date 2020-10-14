package com.lk.day13.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
/**
 *  Stream接口中的方法:
 *    foreach()集合中的元素一一进行了操作
 *    函数式接口 Consumer 是方法foreach的参数
 *    传递此接口实现类
 *
 *    函数式接口 Consumer 消费
 *    抽象方法accept
 */
public class StreamDemo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        //集合方法，获取Stream流对象
        Stream<String> stream = list.stream();
        // void accept(String t);
        //stream操作的集合泛型是String
        //遍历名s,代表了集合中的元素,s传递到accept方法体
        stream.forEach(s-> System.out.println(s));

        /*list.stream().forEach((String s)->{
            System.out.println(s);
        });*/
    }
}
