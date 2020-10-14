package com.lk.day12.stream;

import java.io.FileWriter;
import java.io.IOException;
/**
 *  字符输出流使用的便捷类
 *  java.io.FileWriter 写入文本文件  继承Writer
 *
 *  FileWriter继承转换流OutputStreamWriter
 *
 *  OutputStreamWriter父类,可以指定编码表
 *  FileWriter子类,只能使用默认的编码表
 *  write写入数据的方法:
 *    写入单个字符,字符数组,字符串
 *    构造方法,传递字符串的文件名
 */
public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        //创建字符输出流的便捷类
        //构造方法中,字节传递字符串形式文件名
        FileWriter fw = new FileWriter("e://12.txt");
        //写入数据
        fw.write("废物");

       char[] chars = "helloworld".toCharArray();
        fw.write(chars);

        fw.write(97);

        fw.close();
    }
}
