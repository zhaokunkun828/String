package com.zsk.day09;

import java.io.File;

/**
 * 获取并输出当前目录下所有文件的名字
 *
 */
public class Test06 {
    public static void main(String[] args) {
        File dir = new File("Demo");//获取当前目录下的文件以及文件夹的名称
        printDir(dir);
    }

    public static void printDir(File dir) {
        //获取子文件和目录
        File[] files = dir.listFiles();
        //循环打印
        /**
         * 判断：
         * 当是文件时，打印绝对路径。
         * */
        for (File file : files) {
            //判断
            if (file.isFile()) {
                //是文件，输出文件绝对路径
                System.out.println("文件名：" + file.getAbsolutePath());
            }
        }
    }

}
