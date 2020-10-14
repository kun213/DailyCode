package com.lk.day10.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {
   private int ticket = 100;
   private Lock lock = new ReentrantLock();
 //private Object object = new Object();

    public void run() {
        while (true){
            lock.lock();
           // synchronized (object) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "出售第" + ticket-- + "张票");
                }
            //}
            lock.unlock();
        }
    }
}
