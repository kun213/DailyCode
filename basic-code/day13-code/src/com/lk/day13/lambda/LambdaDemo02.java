package com.lk.day13.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * 带有返回值和参数的 lambda表达式
 * 分析:
 *   目的是集合排序,自定义比较器
 *   不得意,实现接口Comparator,重写方法compare
 *   sort方法,传递接口实现类
 *
 *   lambda 去掉面向对象束缚
 *
 *   实现接口,重写方法
 */

public class LambdaDemo02 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("张三",16));
        list.add(new Person("王五",25));
        list.add(new Person("赵六",15));
        list.add(new Person("李四",36));

       /* System.out.println("匿名内部类----------");
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        });
        System.out.println(list);*/


        System.out.println("Lambda-------------");
        Collections.sort(list,(Person p1,Person p2)->{return p1.getAge()-p2.getAge();});
        System.out.println(list);
    }
}

//定义比较器接口实现类
/*class MyComparator implements Comparator<Person>{
    //p2-p1 降序 大到小
    //p1-p2 升序 小到大
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge()-o2.getAge();
    }
}*/
