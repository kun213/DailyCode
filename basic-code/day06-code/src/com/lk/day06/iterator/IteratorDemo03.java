package com.lk.day06.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 并发修改异常
 * 不能出现!!
 *
 * 在使用迭代器迭代集合的过程中,使用了集合本身的功能,修改了集合的长度
 *
 * 集合,存储若干个字符串,使用迭代器遍历
 * 遍历过程中,为集合添加元素
 */
public class IteratorDemo03 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();
        coll.add("i");
        coll.add("love");
        coll.add("java");


        Iterator<String> it = coll.iterator();
        while(it.hasNext()){
            String s = it.next();
            if ("java".equals(s)){
                coll.remove("java");
            }

            System.out.println(s);
        }
        System.out.println(coll);
    }
}
