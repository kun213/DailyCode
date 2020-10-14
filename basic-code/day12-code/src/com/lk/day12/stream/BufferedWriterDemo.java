package com.lk.day12.stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 *  字符输出流的缓冲流
 *  java.io.BufferedWriter 继承 Writer 本身就是字符输出流(只能操作文本文件)
 *  BufferedWriter自己的功能: void newLine() 写入换行
 *
 *  操作系统不同,换行符号也不同,方法newLine()换行,屏蔽掉操作系统的特性
 *
 *  JVM版本是Window,newLine()  \r\n
 *  JVM版本是Linux,newLine()   \n
 *  JVM版本是Mac,newLine()   \r
 *
 *  BufferedWriter构造方法中
 *    BufferedWriter(Writer w)传递任意字符输出流
 *    传递哪个流,就对这个流高效处理,可以传递的字符输出流
 *       FileWriter , OutputStreamWriter
 *
 */
public class BufferedWriterDemo {
    public static void main(String[] args)throws IOException{
        //创建字符输出流
        //ileWriter fw = new FileWriter("e:/1.txt");
        //创建字符输出流的缓冲流,构造方法中,传递字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("e:/1.txt"));
        bw.write("第一行");
        bw.newLine();//使用方法换行
        bw.write("第二行");
        bw.close();
    }
}
