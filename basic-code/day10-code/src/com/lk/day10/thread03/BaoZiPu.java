package com.lk.day10.thread03;

/**
 * 资源对象，包子
 * 被线程调用的
 *
 *
 *  flag =false 指示灯，标记
 *  指示线程，该做什么
 *  默认值false ， 没有包子，需要生产线程进行生产，对变量count++
 *  生产线程，完成任务， 修改标志位= true (有包子)，唤醒对方线程。
 *
 *  flag=true 指示线程，有包子，需要消费者线程进来消费，对变量输出打印
 *  消费已经完成，修改标志位 = false(无包子)，唤醒对方线程。
 */

public class BaoZiPu {
    private int count;

    //定义布尔变量，标志位
    private boolean flag =false ;

    //get方法，被消费者线程调用，输出
    public synchronized void get() {
        //判断标志位，是否允许消费
        //flag是false，没有包子，不能消费
        //等，等生产完毕
       while (flag == false){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费第 "+count+" 个包子...");
        //修改标志位
       flag = false;
        this.notifyAll();//唤醒全部线程
    }
    //set方法，被生存者线程调用，++变量
    public synchronized void set() {
       while (flag == true){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count++;
        System.out.println("生产第 "+count+" 个包子");
         flag = true;
        this.notifyAll();//唤醒全部线程
    }
}
