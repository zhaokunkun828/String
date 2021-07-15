package com.zsk.day08;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 * @author Xiloer
 *
 */
public class Test04 {
    public static void main(String[] args) {
        //创建一个List集合并添加元素0-9
        List<Integer> d =new ArrayList<Integer>();
        d.add(0);
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);
        d.add(5);
        d.add(6);
        d.add(7);
        d.add(8);
        d.add(9);
        //然后获取子集[3,4,5,6]
        List<Integer> e= d.subList(3, 7);
        for(int i =0;i<e.size();i++) {
            int f = e.get(i);
            //然后将子集元素扩大10倍
            f=f*10;
            e.set(i, f);
        }
        //然后输出原集合
        System.out.println(e);
    }

}
