package com.lk.day11.buffered;

import java.io.*;

public class BufferedDemo {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\1111.docx"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\copy.docx"));
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = bis.read())!=-1){
            bos.write(bytes,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println("缓冲流使用数组复制时间:"+(end - start)+" 毫秒");


    }
}
