package com.lk.day12.stream;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 字节流写入数据: 追加和换行
 * 流对象构造方法,第二个参数true
 * 换行问题:
 *   Windows:  \r\n
 *   Linux:    \n
 *   Mac:      \r
 */
public class FileWriterDemo02 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day12-code/1.txt",true);
        fw.write("第一行\n");
        fw.write("第二行");
        fw.write("第三行");
        fw.close();
    }
}
