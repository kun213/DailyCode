package com.lk.day01.abstract02;

public class JavaEE extends Employee {
    @Override
    public void work() {
        System.out.println("员工工号："+getId()+"员工姓名："+getName()+"JavaEE工程师开发网页后台");
}
}
