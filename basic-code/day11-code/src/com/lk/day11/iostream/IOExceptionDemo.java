package com.lk.day11.iostream;


import java.io.FileOutputStream;
import java.io.IOException;

/**
 *  IO异常处理
 *
 *  new FileOutputStream("a.txt") 文件在工程根目录下
 *  new FileOutputStream("day11/a.txt"); 文件当前模块下
 */
public class IOExceptionDemo {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("f.txt");//如果路径错误，fos是null
            fos.write(102);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fos != null)//这里需要判断一下，防止返回空指针异常
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
