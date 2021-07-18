package com.zsk.io;

import java.io.File;

/*
* fiile 的其他
* */
public class Io02 {
    public static void main(String[] args) {
        //创建文件夹 所有IO底层都不是java操作的，而是 java调用所在系统的底层的操作.
        File file = new File("io");
        if (!file.exists()){
            file.mkdir();//不加ls只能1层，加s可以多层，一般用s
        }else {
            System.out.println("文件存在");

        }
        File file1 = new File("io1/io2/io3");
        if (!file.exists()){
            file.mkdirs();

        }else {
            System.out.println("文件存在");
        }

    }
}
