package com.lk.day13.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * lambda表达式的好处和弊端
 *
 *   弊端: 使用场景局限太大
 *     适用于接口,接口中只能有一个抽象方法
 *     Runnable接口,只有一个抽象方法run
 *     Comparator接口,只有一个抽象方法 compare
 *
 *   好处: 减少代码量
 *     可推导可省略
 *       1: 方法体: 只有1行代码,{} 可以省略
 *       2: 方法依赖接口,明确返回int类型  return int;  可以省略return
 *       3: 方法参数
 *         sort(ist)集合排序 , list集合明确了存储的数据类型泛型  <Person>
 *             比较器接口Comparator,比较的对象也是Person
 *             参数类型可以省略
 */
public class LambdaDemo03 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("张三",16));
        list.add(new Person("王五",25));
        list.add(new Person("赵六",15));
        list.add(new Person("李四",36));
        System.out.println(list);

        /*Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/
        /**
         * Lambda表达式,简化匿名内部类
         * (参数Person对象)-> 参数传递到方法体
         * {方法体,可以直接使用参数}
         *
         * return 的结果,直接到达sort方法
         */
        Collections.sort(list,(p1,p2)->p1.getAge()-p2.getAge());
        System.out.println(list);
    }
}
