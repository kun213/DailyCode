package com.lk.day12.stream;

import java.io.FileReader;
import java.io.IOException;
/**
 *  java.io.FileReader 读取字符文件的便捷类
 *  继承 InputStreamReader ,继承Reader
 *  FileReader读取文本文件,不能改变编码表的,使用默认的UTT-8
 *
 *  构造方法:
 *    FileReader(String 文件名)
 */
public class FilerReaderDemo {
    public static void main(String[] args) throws IOException{
        //创建字符输入流的便捷类对象
        FileReader fr = new FileReader("e:/utf.txt");
        char[] chars = new char[1];
        int len = 0;
        while ((len = fr.read(chars))!= -1){
            System.out.print(new String(chars,0,len));
        }
        fr.close();
    }
}
