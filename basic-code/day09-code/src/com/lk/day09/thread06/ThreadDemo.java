package com.lk.day09.thread06;
/**
 * 售票案例,引出线程的安全问题
 * 前提: 必须是多个线程,同时操作一个资源
 *
 * 电影票只有100张 (资源)
 * 3个售票窗口,同时出售 (资源共享,100张)
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //创建Runnable接口实现类对
        Ticket t = new Ticket();
        //创建线程对象,3个
        Thread th1 = new Thread(t);
        Thread th2 = new Thread(t);
        Thread th3 = new Thread(t);

         th1.start();
         th2.start();
         th3.start();
    }

}
