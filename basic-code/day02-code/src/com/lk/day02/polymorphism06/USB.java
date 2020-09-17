package com.lk.day02.polymorphism06;
/**
 * 创建USB接口,就是标准,规则
 * 任何的外接设备 ,必须实现接口,实现我的规则
 */
public interface USB {
    public abstract void open();
    public abstract void close();
}
