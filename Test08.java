package com.zsk.day08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。

 *
 */
public class Test08 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner scan = new Scanner(System.in);
        List<Date> list = new ArrayList<Date>();
        for(int i=0;i<3;i++){
            System.out.println("请输入第:"+(i+1)+"个日期:(yyyy-MM-dd格式)");
            String str = scan.nextLine();
            Date date = sdf.parse(str);
            list.add(date);
        }
        //输出集合中的日期
        System.out.println("输出集合中的日期:");
        for(Date date : list){
            System.out.println(sdf.format(date));
        }
        Collections.sort(list);
        System.out.println("排序后输出集合中的日期:");
        for(Date date : list){
            System.out.println(sdf.format(date));
        }
    }
}