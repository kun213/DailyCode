package com.lk.day10.pool03;

import java.util.concurrent.Callable;
/**
 *  实现线程池练习
 *   1： 开启一个线程，计算高斯算法 1+2+3+....+100 = 5050
 *
 *   线程执行任务，选择使用Callable接口
 */
public class GaoSiCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <=100 ; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
