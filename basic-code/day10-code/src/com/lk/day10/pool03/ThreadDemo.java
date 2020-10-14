package com.lk.day10.pool03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(1);
        GaoSiCallable gsc = new GaoSiCallable();
        //提交任务，计算高斯
        Future<Integer> sumFuture = es.submit(gsc);
        System.out.println(sumFuture.get());

    }
}
