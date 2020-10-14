package com.lk.day11.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节流复制文件,任意文件
 * 不能是文件夹
 */
public class CopyFileDemo {
    public static void main(String[] args) {
             method_1();

    }

    /**
     * FileInputStream 读取字节,存储数组
     * FileOutputStream 写入字节数组
     */

    public static void method_2() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //输入流对象,绑定数据源
            fis = new FileInputStream("e:\\1111.docx");
            //输出流对象,绑定数据目的
            fos = new FileOutputStream("e:\\copy\\1111.docx");
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * FileInputStream 读取单个字节
     * FileOutputStream 写入单个字节
     */
    public static void method_1(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("e:\\1111.docx");
            fos = new FileOutputStream("e:\\copy\\1111.docx");
            int len = 0;
            while ((len = fis.read()) != -1) {
                fos.write(len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
