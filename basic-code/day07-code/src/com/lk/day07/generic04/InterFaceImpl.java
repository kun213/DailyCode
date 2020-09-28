package com.lk.day07.generic04;

/**
 *  实现接口,不明确泛型
 *  泛型指定全,交给调用者
 */
public class InterFaceImpl<T> implements IntreFace<T>{
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
