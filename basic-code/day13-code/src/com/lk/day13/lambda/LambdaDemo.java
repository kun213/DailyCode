package com.lk.day13.lambda;
/**
 *  线程程序,分析问题
 *    实现线程的程序,必须在Thread类的构造方法中,传递Runnable接口实现类
 *
 *    传递参数,不得意去实现了接口Runnable,重写方法run()
 *
 *    匿名内部类: new接口(){ 重写方法run()  }
 *
 *    面向对象的束缚
 *
 *    run方法才是关键所在
 *    核心: run()方法的方法体中的代码
 *
 *    JDK8新特性 lambda 摆脱面向对象的语法束缚 (语法糖)
 *    关键方法上,方法体
 */

public class LambdaDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类");
            }
        });
        thread.start();
/**
 * lambda表达式格式
 *
 * public void run(){
 *
 *     //代码
 * }
 *
 *  () 表示方法中的参数列表
 *  -> 参数列表中的参数传递到方法体
 *  {} 方法体
 */
        Thread thread1 = new Thread(()->{System.out.println("Lambda");});
        thread1.start();
    }
}

/*class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("开启线程");
    }
}*/
