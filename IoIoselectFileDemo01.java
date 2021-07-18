package com.zsk.io;

import java.io.File;
/*
* 查看
* */
public class IoIoselectFileDemo01 {
    private static long size = 0;
    public static void main(String[] args) {
        //查询当前目录下的所有文件
        File file =new File(".");
        File[] files=file.listFiles();
        //有什么样的方法可以全部查看所有的文件呢
        findAll(file);
        System.out.println("size = " + size +"字节");


    }
    public static long  findAll(File file){
        File[] files = file.listFiles();

        for (File file1: files) {
            if (file1.isDirectory()){
                findAll(file1);//递归
            }else {
                System.out.println("file1 = " + file1.length());
                size = file1.length();
            }

        }
        return size;

    }
}
