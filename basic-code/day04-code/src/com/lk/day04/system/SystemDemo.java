package com.lk.day04.system;
/**
 *  java.lang.System表示系统
 *  很多有用的字段(成员变量)out,in
 *  System类不能创建对象,private修饰构造方法
 *  静态调用 System.类名
 */
public class SystemDemo {
    public static void main(String[] args) {
        method_1();
        method_2();


    }
    /**
     *  毫秒值,测试10000次循环需要的时间
     */
    public static void method_2(){
        long start = System.currentTimeMillis();
        for (int i = 0; i <10000 ; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    /**
     * System类的方法
     * static void exit(int status)  结束JVM运行
     * 参数传递int类型,使用的时候,传递的是0
     * 正常结束JVM, 异常结束
     */
    public static void method_1(){
        while(true){
            System.exit(0);
            //代码无意义
        }
    }
}
