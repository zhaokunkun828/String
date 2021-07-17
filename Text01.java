package com.zsk.day10;


import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
* 遍历 你D盘 的 其中一个文件夹 , 并查找出 文件中带有 java 的 文件
*遍历 你D盘 的 其中一个文件夹 , 并查找出 文件后缀名带有.class的文件
* */
public class Text01 {

    public static void main(String[] args) {
        File desktop = new File("D:\\aaa");
        String[] arr = desktop.list();
        for (String string : arr) {
            if(string.endsWith(".java")) {   //
                System.out.println(string+"我是Java文件");
            }
        }
        for (String string : arr) {
            if(string.endsWith(".class")) {
                System.out.println(string+"我是class文件");
            }
           /* long size = 0;
            File file =new File(".");
            File[] files=file.listFiles();

            System.out.println("size = " + size +"字节");*/
        }

    }
}






