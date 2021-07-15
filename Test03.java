package com.zsk.day08;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合(ArrayList,LinkedList均可)
 * 存放元素"one","two","three","four"。
 * 获取集合第二个元素并输出。
 * 将集合第三个元素设置为"3"
 * 在集合第二个位置上插入元素"2"
 * 删除集合第三个元素。
 * @author Xiloer
 *
 */
public class Test03 {
    public static void main(String[] args) {
//创建一个List集合(ArrayList)
        //存放元素"one","two","three","four"。
        List<String> c = new ArrayList<String>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        //获取集合第二个元素并输出。
        System.out.println(c.get(1));
        //将集合第三个元素设置为"3"
        c.set(2, "3");
        System.out.println(c);
        //在集合第二个位置上插入元素"2"
        c.add(1,"2");
        System.out.println(c);
        //删除集合第三个元素。
        c.remove(2);
        System.out.println(c);
    }
}
