package com.lk.day11.file08;

import java.io.File;
import java.io.FileFilter;

public class FileDemo {
    public static void main(String[] args) {
        getAll(new File("E:\\JavaSE"));
    }

    public static void getAll(File dir) {
        File[] files = dir.listFiles(new MyFilter());
        for (File f : files) {
            if (f.isDirectory()) {
                getAll(f);
            } else {
                System.out.println(f);
            }
        }
    }
}

/**
 * 遍历目录,全遍历
 * 要目录中的.java文件
 */
class MyFilter implements FileFilter{
    public boolean accept(File pathname) {
        //pathname路径,是目录,直接放行,不能过滤
        if(pathname.isDirectory()) //E:\JavaSE
            return true;

        //E:\JavaSE  参数路径,判断是不是.java结尾
        return pathname.toString().endsWith(".java");
    }
}
