package com.lk.day13.stream;

import java.util.stream.Stream;

public class StreamDemo05 {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("1", "2", "3");
        Stream<String> s2 = Stream.of("4", "5", "6");
        Stream<String> concatStream = Stream.concat(s1, s2);
        concatStream.forEach(s-> System.out.println(s));
    }
}
