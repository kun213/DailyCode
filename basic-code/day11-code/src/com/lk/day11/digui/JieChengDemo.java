package com.lk.day11.digui;

public class JieChengDemo {
    public static void main(String[] args) {
        int jieCheng = getJieCheng(5);
        System.out.println(jieCheng);
    }
    /**
    通过递归算法实现.
    参数列表:int
    返回值类型: int
     */
    public static int getJieCheng(int num){
         /*
        num为1时,方法返回1,
        相当于是方法的出口,num总有是1的情况
           */
        if (num == 1){
            return 1;
        }else {
             /*
            num不为1时,方法返回 num +(num-1)的累和
            递归调用getJieCheng方法
              */
            return num * getJieCheng(num-1);
        }
    }


}
