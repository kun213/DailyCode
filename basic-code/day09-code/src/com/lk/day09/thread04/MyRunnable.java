package com.lk.day09.thread04;

public class MyRunnable implements Runnable{

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程名称："+Thread.currentThread().getName()+"启动线程");
        }

    }
}
