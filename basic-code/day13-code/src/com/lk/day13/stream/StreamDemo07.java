package com.lk.day13.stream;

import java.util.stream.Stream;
/**
 * Stream接口方法count()
 * 返回long,返回Stream对象中元素的个数
 *
 * 此流终结,使用完毕,不能在继续使用Stream对象的方法
 * void foreach()终结此流
 */
public class StreamDemo07 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("3", "5", "4", "1", "2");
        long count = stream.count();
        System.out.println(count);
    }
}
