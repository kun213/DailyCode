package com.lk.day07.generic06;

public class Teacher extends Employee {

    @Override
    public void work() {
        System.out.println("老师在上课"+getName()+" "+getAge());
    }
}
