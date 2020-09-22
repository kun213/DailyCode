package com.lk.day05.exception07;

/**
 * finally代码块,跟随try catch出现
 * try{
 *     检测代码,
 *     可能出现异常的代码
 * }catch(){
 *     捕获异常,处理异常
 * }finally{
 *     这里的代码,一定要执行
 *     无论是否有异常
 * }
 *
 *  使用finally代码块: 基本上用来释放资源
 */
public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            int[] arr = {1,5,6,2};
            System.out.println(arr[9]);
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            System.out.println("必须执行的代码");
        }
    }
}
