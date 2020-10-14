package com.lk.day09.thread03;

public class MyThread extends Thread {

    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("线程名称："+t.getName());
        // System.out.println(Thread.currentThread().getName()+"线程名称");
    }
}
