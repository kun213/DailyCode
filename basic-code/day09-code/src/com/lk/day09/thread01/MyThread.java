package com.lk.day09.thread01;

public class MyThread extends Thread {
    /**
     * 重写run方法，完成该线程执行的逻辑
     */
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("重写run方法.."+i);
        }
       }

}
