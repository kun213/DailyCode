package com.lk.day13.stream;

import java.util.ArrayList;
import java.util.List;

/**
 *  需求,操作集合
 *  list集合存储一些元素,都名字
 *
 *  list集合,获取出所有姓张的,保存
 *
 *  姓张集合中,获取出名字是三个字的,保存
 *
 *  集合操作弊端: 代码量大,重复性高,浪费内存
 *
 *  JDK8出现新特性 Stream流对象
 */

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");

        //定义集合,保存姓张
        List<String> zhangList = new ArrayList<String>();
        //遍历list集合,找元素是姓张的,存储在zhangList
        for (String s : list){
            if(s.startsWith("张")){
                zhangList.add(s);
            }
        }

        System.out.println(zhangList);
        //定义集合,保存姓为张是三个字
        List<String> sanList = new ArrayList<String>();
        for (String s : zhangList){
            if(s.length()==3){
                sanList.add(s);
            }
        }
        System.out.println(sanList);

    }
}
