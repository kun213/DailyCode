package com.lk.day10.thread04;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 *  线程通信的方法： wait() notify() 弊端
 *  执行等待，或者是唤醒，都要和操作系统进行交互
 *  方法源码，C++编写，让操作系统，通知CPU，线程挂起
 *
 *  JDK1.5 出现新包juc  java.util.concurrent 并发包
 *  locks包， Lock接口，方法 lock()  释放锁unlock()， 取代同步synchronized，去掉了Object类中的线程通信方法
 *
 *  java.util.concurrent.locks.Condition接口
 *  Condition接口实现等待和唤醒，必须依赖锁对象，依赖Lock接口锁
 *
 *  关键： Lock接口中，定义方法 newCondition() 返回Condition接口的实现类对象
 *  Lock是接口，如果调用接口中的方法newCondition();Lock接口的实现类ReentrantLock
 *
 *  Condition接口实现原理
 *      阻塞队列，内存中的容器 （队列，先进先出。 阻塞，等待别动）
 *
 *   Condition接口
 *     方法 await() 线程等待： 将线程的锁释放，进入到阻塞队列
 *     方法 signal() 唤醒线程： 线程从阻塞队列中拿出，线程从新获取锁
 *
 *
 *   Object: notifyAll() 满足多生产和多消费，不得以唤醒了全部的线程（浪费资源）
 *   Condition signal() 唤醒对方线程！！
 *
 *
 */
/**
 * 生产者和消费者案例
 * 改进：Lock锁和Condition接口
 */

public class BaoZiPu {
    private int count;

    //定义布尔变量，标志位
    private boolean flag =false ;

    private Lock lock = new ReentrantLock();
    //获取出Condition接口对象，lock接口的方法 newCondition（）
    private Condition product = lock.newCondition();
    private Condition customer = lock.newCondition();

    public void get(){
        lock.lock();
      while (flag == false ){
            try {
                customer.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消耗了"+count+"个包子");
        flag = false;
        product.signal();
        lock.unlock();
    }
    public void set(){
        lock.lock();
       while (flag == true){
            try {
                product.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count++;
        System.out.println("生产了"+count+"个包子");
        flag = true;
        customer.signal();
        lock.unlock();
    }
}
