package com.lk.day11.iostream;

import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 字节输出流: java.io.OutputStream
 * 作用: 从内存中,将字节写入到其他设备
 * OutputStream类的方法: write
 *
 *  void write(int b)写入的单个字节
 *  void write(byte[] b)写入字节数组
 *  void write(byte[] b ,int off,int len)字节数组一部分写入到设备
 *                       开始索引,写入的字节个数
 *  close()关闭流对象,释放资源
 *
 *  子类FileOutputStream 写入文件数据
 *  构造方法:
 *     FileOutputStream(File file) 传递File类型对象
 *     FileOutputStream(String name) 传递字符串文件名
 *     构造方法中传递的都称为写入的数据目的
 *
 *   IO流使用的通用步骤:
 *     1: 创建IO流对象
 *     2: 调用方法,写入或者读取
 *     3: 释放资源
 */

public class OutputStream {
    public static void main(String[] args) throws IOException {
        method_3();
    }
    /**
     * 字节输出流创建文件,文件存在,覆盖
     * 在文件的基础之上接着写
     * FileOutputStream()构造方法第二个参数,布尔类型,传递true,追加写入
     */
    public static void method_3() throws IOException {
        FileOutputStream fos = new FileOutputStream("e:\\b.txt",true);
        fos.write(99);
        fos.close();
    }

    /**
     * FileOutputStream类,向文件中写入字节数组
     *  void write(byte[] b)写入字节数组
     *  void write(byte[] b ,int off,int len)字节数组一部分写入到设备
     */
    public static void method_2() throws IOException{
        FileOutputStream fos = new FileOutputStream("e:\\b.txt");
        byte[] bytes = "agafdfsfsdfs".getBytes();
        //写入数组一部分,1索引开始,写3个
        fos.write(bytes,3,3);
        fos.close();
    }
    /**
     * FileOutputStream类,向文件中写入单个字节
     * 字节输出流,创建文件能力,文件已经存在,覆盖
     * void write(int b)写入的单个字节
     */
    public static void method_1() throws IOException{
        FileOutputStream fos = new FileOutputStream("e:\\a.txt");
        fos.write(48);
        fos.write(49);
        fos.write(50);
        fos.close();
    }
}
