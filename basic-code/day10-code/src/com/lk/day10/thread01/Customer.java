package com.lk.day10.thread01;
/**
 * 消费者线程
 * 调用资源对象，包子铺方法get
 */
public class Customer implements Runnable {
    private BaoZiPu baoZiPu;
    public Customer(BaoZiPu baoZiPu){
        this.baoZiPu = baoZiPu;
    }
    @Override
    public void run() {
        while (true){
           synchronized (baoZiPu){
               //消费者线程，判断标志位，是否允许消费
               //fla是false，没有生产完，不能消费
               //等，等生产完毕
             if (baoZiPu.getFlag() == false) {
             try {
                 baoZiPu.wait();
             } catch (InterruptedException e) {
                 e.printStackTrace();
               }
             }
                baoZiPu.get();
             //消费完毕，修改标志位
                baoZiPu.setFlag(false);
                //唤醒生产线程
                baoZiPu.notify();
            }
         }

    }
}
