package com.lk.day05.exception02;

public class ExceptionDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int i = getArray(arr);
        System.out.println(i);
        System.out.println("程序结束");
    }
    public static int getArray(int[] arr){
        return arr[4];
    }
}
