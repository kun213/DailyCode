package com.lk.day07.generic02;

/**
 * 类似ArrayList定义,在类的右边加上<>
 *  定义泛型:Q 是什么数据类型
 *  在new对象的时候,才能指定
 */
public class Factory<T> {
    private T name;


    public Factory() {
    }

    public Factory(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public void add(T t){
        System.out.println(t);
    }
}
