package com.lk.day13.function;

import java.util.function.Supplier;
/**
 * 函数式接口Supplier,实现数组最大值获取
 */
public class SupplierDemo02 {
    public static void main(String[] args) {
       int[] arr = {4, 5, 1, 31, 84, 5, 6};
        
         int arrMax = getMax(()->{
            int max = arr[0];
              for (int i = 0; i <arr.length ; i++) {
                  if(arr[i]>max)
                      max = arr[i];
              }
              return max;
          });
        System.out.println(arrMax);
    }
        //System.out.println("正常调用-----");
       /* MySupplier mySupplier = new MySupplier();
        int max = getMax(mySupplier);
        System.out.println(max);
    }*/


    public static int getMax (Supplier<Integer> supplier) {
        int max = supplier.get();
       return max;
    }
}
    /*class MySupplier implements Supplier<Integer> {
        @Override
        public Integer get() {
            int[] arr = {4, 5, 1, 31, 84, 5, 6};
            int max = arr[0];
            for (int i = 0; i <arr.length; i++) {
                if (arr[i] > max)
                    max = arr[i];
            }
            return max;
        }
    }*/

