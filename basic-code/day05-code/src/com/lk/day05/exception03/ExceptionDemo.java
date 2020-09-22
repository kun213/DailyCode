package com.lk.day05.exception03;

/**
 *  异常的处理方式: try catch  finally 处理方式
 *  格式:
 *     try{
 *         被检测的代码
 *         可能出现异常的代码
 *     }catch( 异常类的类名  变量名 ){
 *         异常的处理方式
 *     }
 *
 *     try: 关键字 是尝试的意思,一旦出现异常
 *     catch : 关键字 抓住异常, 捕获,进行处理
 *     异常的处理方式:  有catch抓住异常,就叫做处理了
 *     处理方式任意: 变量,new 对象,调用方法,判断,循环
 */
/**
 * public String getMessage():获取异常的描述信息,原因(提示给用户的时候,就提示错误原因。
 *public String toString():获取异常的类型和异常描述信息(不用)。
 * public void printStackTrace():打印异常的跟踪栈信息并输出到控制台。(常用)
 *
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        int[] arr  = {1,2,3};
        try {
            int i = getArray(arr);
            System.out.println(i);
        }catch (Exception ex){
            //调用Throwable类方法
            //public String getMessage():获取异常的描述信息,原因(提示给用户的时候,就提示错误原因。
            String message = ex.getMessage();
            System.out.println("message="+message);// 5

            //public String toString():获取异常的类型和异常描述信息(不用)。
            String str = ex.toString();
            System.out.println("str="+str);// java.lang.ArrayIndexOutOfBoundsException: 5

            //public void printStackTrace():打印异常的跟踪栈信息并输出到控制台。(常用)
            ex.printStackTrace();//异常信息: 异常类名,越界索引,程序出现的行数 (主力)
        }
        System.out.println("程序结束");
    }

    public static int getArray(int[] arr){
        return arr[5];
    }
}
