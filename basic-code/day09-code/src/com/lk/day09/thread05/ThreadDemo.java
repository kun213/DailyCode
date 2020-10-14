package com.lk.day09.thread05;

/**
 *  使用匿名内部类,实现线程程序
 *  1: 继承父类
 *  2: 实现接口
 *
 *  匿名内部类: 取代了实现类,或者子类
 *
 *  格式:
 *    new 父类接口(){
 *        重写父类方法();
 *    }
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //匿名内部类,取代Thread的子类
        //就是在创建他的子类对象
        new Thread() {
            public void run() {
                System.out.println("匿名内部类实现线程_继承");
            }
        }.start();
     //匿名内部类,取代Runnable接口实现类
   //匿名内部类创建了接口实现对象，多态
    Runnable r = new Runnable(){
        public void run() {
            System.out.println("匿名内部类实现线程_接口");
        }
    };
     Thread t = new Thread(r);
      t.start();
}
}
