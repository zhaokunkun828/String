package com.zsk.day08;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合，并添加元素0-9
 * 将集合转换为一个Integer数组并输出数组每一个元素
 * @author Xiloer
 *
 */
public class Test05 {
    public static void main(String[] args) {
        List<Integer> g =new ArrayList<Integer>();
        for(int i =0 ; i<=9;i++)
        {
            g.add(i, i);
        }
        System.out.println(g);

        Object[] h=g.toArray();
        for(Object a1:h) {
            System.out.print(a1);
        }
    }
}
