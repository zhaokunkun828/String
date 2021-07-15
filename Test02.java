package com.zsk.day08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 创建一个集合，存放元素"1","$","2","$","3","$","4"
 *   使用迭代器遍历集合，并在过程中删除所有的"$"，
 *   最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
 *
 */
public class Test02 {
    public static void main(String[] args) {
        //.创建一个集合，存放元素"1","","2","","2","","2","","3","","4"使用迭代器遍历集合，并在过程中删除所有的"","4" 使用迭代器遍历集合，并在过程中删除所有的"","4"使用迭代器遍历集合，并在过程中删除所有的""，
//最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
        Collection<String> a = new ArrayList<String>();
        a.add("1");
        a.add("$");
        a.add("2");
        a.add("$");
        a.add("3");
        a.add("$");
        a.add("4");
        Iterator<String> it = a.iterator();
        while(it.hasNext()) {
            if(it.next()=="$") {
                it.remove();
            }
        }for(String s:a) {
            System.out.println(s);
        }
    }
}
