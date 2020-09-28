package com.lk.day07.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();
        set.add("cc");
        set.add("java");
        set.add("a");
        set.add("love");
        for (String s : set){
            System.out.println(s);
        }
    }
}
