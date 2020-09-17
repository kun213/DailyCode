package com.lk.day02.polymorphism06;

public class KeyBoard implements USB{
    @Override
    public void open() {
        System.out.println("键盘开机");
    }

    @Override
    public void close() {
        System.out.println("键盘关机");
    }
}
