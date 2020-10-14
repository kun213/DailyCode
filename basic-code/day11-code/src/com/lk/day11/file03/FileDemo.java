package com.lk.day11.file03;

import java.io.File;
/**
 * File类的获取方法
 *   基本上都是get开头
 */
public class FileDemo {
    public static void main(String[] args) {
            method_2();
    }
    /**
     *  String getPath() 将构造方法中的路径,转成字符串
     */
    public static void method_5(){
        File file = new File("E:\\JavaEE\\IdeaProjects\\basic-code");
        String path = file.getPath();
        System.out.println(path.toString());
    }

    /**
     *  File getAbsoluteFile() 返回File构造方法中路径的绝对路径形式
     *  返回值是File对象
     *
     *  注意: 直接传递文件名,或者文件夹名
     *  获取到的绝对路径,将从IDEA的工程下计算
     */
    public static void method_4(){
        File file = new File("1.txt");
        File abso = file.getAbsoluteFile();
        System.out.println(abso);
    }

    /**
     * long length() 获取File构造方法中路径表示的文件的字节数
     */
    public static void method_3(){
      File file = new File("E:\\开始学习的Java笔记和代码\\测试io\\1.txt");
        long l = file.length();
        System.out.println(l);
    }
    /**
     * File getParentFile()  获取,构造方法中封装的路径的父路径
     * 上一级文件夹
     * 方法的返回值是File对象,可以方法调用链
     * 如果此路径名没有父目录，则返回 null。
     */
    public static void method_2(){
        File file = new File("E:\\JavaEE\\IdeaProjects\\basic-code");
        File parent = file.getParentFile().getParentFile();
        System.out.println(parent);
    }

    /**
     * String getName() 返回名字
     * 获取了,构造方法中封装路径,最后的名称
     * 名称可能是文件夹名,可能是文件名
     */
    public static void method_1(){
        File file = new File("E:\\JavaEE\\IdeaProjects\\basic-code");
        String name = file.getName();
        System.out.println(name);
    }
}
