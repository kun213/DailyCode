package com.lk.day07.generic06;

public class Manager extends Employee {
    @Override
    public void work() {
        System.out.println("管理员在上课"+getName()+" "+getAge());
    }
}
