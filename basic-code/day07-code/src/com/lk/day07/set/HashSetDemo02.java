package com.lk.day07.set;

import com.lk.day07.domain.Person;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet集合存储自定义对象 Person
 * 要求:
 *   Person对象中,姓名和年龄是相同的
 *   认为是同一个对象
 *
 *  实现要求:
 *    哈希表判断元素是否相同: hashCode()和equals()方法
 */
public class HashSetDemo02 {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<Person>();
        set.add(new Person("zhangsan",21));
        set.add(new Person("lisi",25));
        set.add(new Person("lisi",25));
        set.add(new Person("wangwu",22));
        set.add(new Person("zhaoliu",23));
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.equals(s2));
        for (Person person : set){
            System.out.println(person);
        }
    }
}
