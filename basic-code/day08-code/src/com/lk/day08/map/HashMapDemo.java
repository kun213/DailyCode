package com.lk.day08.map;

import com.lk.day08.domain.Person;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * java.util.HashMap集合
 * 实现了Map接口
 *   底层是哈希表结构 数组+链表(单向)
 *   JDK1.8开始,当数组中的链表的节点到达8个,转成红黑树结构
 *   集合是无顺序
 *   允许存储null值,null键
 *   线程不安全,运行速度快
 *
 *   开发人员: 保证键对象的唯一性
 *   存储到哈希表中的对象,必须实现 hashCode,equals
 */
public class HashMapDemo {
    public static void main(String[] args) {
        /**
         * 自定义对象存储到HashMap集合
         * 字符串作为值,Person对象作为键
         * 哈希表,保证键的唯一性: 重写方法hashCode,equals
         */
        Map<Person,String> map = new HashMap<Person,String>();
        map.put(new Person("张三",20),"北京市");
        map.put(new Person("李四",20),"北京市");
        map.put(new Person("李四",20),"北京市");
        map.put(new Person("王武",20),"北京市");
        map.put(new Person("赵柳",20),"北京市");
       //键找值方式
        //增强for循环
        System.out.println("增强for循环----------------键找值方式");
        //Set<Person> people = map.keySet();
        for(Person p : map.keySet()){
            //String s = map.get(p);
            System.out.println(p+" "+map.get(p));
        }
        System.out.println("键找值方式-------------------迭代器方式");
        //迭代器方式（iterator）
        Set<Person> set = map.keySet();
        Iterator<Person> it = set.iterator();
        while (it.hasNext()){
            Person p = it.next();
            String s = map.get(p);
            System.out.println(p+s);
        }
        System.out.println("增强for循环---------------值对方式");
        //键值对方式
        //增强for循环
       // Set<Map.Entry<Person, String>> entries = map.entrySet();
        for (Map.Entry<Person, String> entry :map.entrySet()){
            //Person key = entry.getKey();
           // String value = entry.getValue();
            System.out.println(entry.getKey()+entry.getValue());
        }
        System.out.println("------------------------------------");
         Set<Map.Entry<Person, String>> entries = map.entrySet();
        Iterator<Map.Entry<Person, String>> it1 = entries.iterator();
        while(it1.hasNext()){
            Map.Entry<Person, String> entry = it1.next();
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+value);
        }
    }
}
