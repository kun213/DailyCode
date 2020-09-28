package com.lk.day07.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("张三");
        set.add("李四");
        set.add(new String ("张三"));
        set.add("王五");
        set.add("重地");
        set.add("通话");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("-----------------");

        for (String s : set){
            System.out.println(s);
        }
    }
}
