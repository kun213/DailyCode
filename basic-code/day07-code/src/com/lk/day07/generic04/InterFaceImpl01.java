package com.lk.day07.generic04;

public class InterFaceImpl01 implements IntreFace<Integer> {
    @Override
    public void show(Integer integer) {
        System.out.println(integer);
    }
}
