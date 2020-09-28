package com.lk.day07.foreach;

import com.lk.day07.domain.Person;

import java.util.ArrayList;
import java.util.List;
/**
 * JDK1.5版本开始,出现了新特性,增强型的for循环
 * JDK1.5版本后,添加接口: java.lang.Iterable
 * 凡是此接口下的任何实现类,都可以使用for循环
 * Iterable子接口Collection
 *   Collection子接口,List Set
 *  任何单列集合,都可以使用增强for循环
 *  包含数组
 *
 *  增强for循环的格式:
 *    for(数据类型 变量名 : 数组或者集合){
 *
 *    }
 *
 *    增强for循环是 "障眼法"
 *    javac编译器,for循环,直接编译为迭代器Iterator  -- 集合
 *    javac编译器,for循环,直接编译为传统for i++     -- 数组
 */
public class ForDemo {
    public static void main(String[] args) {
        method();
        System.out.println("-------------------");
      method_3();
      method_2();
      method_1();
    }
    /**
     * 增强for循环遍历集合
     * 自定义对象
     */
    public static  void method_3(){
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("张三",15));
        list.add(new Person("李四",19));
        list.add(new Person("王五",25));
        list.add(new Person("赵六",27));
        for (Person p:list){
            System.out.println(p);
        }
    }
    /**
     * 增强for循环遍历集合
     */
    public static void method_2(){
        List<String> list = new ArrayList<String>();
        list.add("i");
        list.add("love");
        list.add("you");
        list.add("java");
        list.add("money");
        for (String s:list){
            System.out.println(s);
        }
    }

    /**
     * 增强for循环遍历数组
     * 思考问题:
     *    好处: 减少代码量,适合遍历
     *    弊端: 不能动容器中的任何元素
     */
    public static void method_1(){
        int[] arr ={1,5,3,9,11};
        for (int i : arr){
            System.out.println(i);
        }
    }
    public static void method(){
    int[] arr = {1,2,5,6,89,13,45,641,31};
    for (int i : arr){
        System.out.println(i);
    }
}
}
