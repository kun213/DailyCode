package com.lk.day13.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *  java.util.stream.Stream 流对象的接口(流水线)
 *  获取到实现类
 *
 *  集合:
 *    Collection接口,JDK8定义方法  Stream接口类型 stream()
 *
 *  数组:
 *    Arrays静态方法 Stream stream()
 *
 *  接口Stream定义静态方法 of(T... values)
 *
 */
public class StreamDemo01 {
    public static void main(String[] args) {
        //根据Collection获取流
        List<String> list = new ArrayList<String>();
        list.add("你好");
        Stream<String> stream = list.stream();
        stream.forEach(s-> System.out.println(s));

        //根据数组获取流
        String[] array = {"76","646","5","4654"};
        Stream<String> stringStream = Stream.of(array);
        stringStream.forEach(s-> System.out.println(s));
    }
}
