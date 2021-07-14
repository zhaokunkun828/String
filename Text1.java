package com.zsk.rq;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 *
 *
 */
public class Text1 {
    public static void main(String[] args) {
       /* LocalDateTime now = LocalDateTime.now();
        System.out.println("当前时间：" + now);
        LocalDateTime plusTime = now.plusDays(3);
        System.out.println("三天后这一刻是：" + plusTime);*/
        Date e = new Date();
        //格式
        SimpleDateFormat f =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //当前时间
        String g = f.format(e.getTime());
        System.out.println(g);
        //三天后这个时间
        String h = f.format(e.getTime()+3*24*3600*1000);
        System.out.println(h);
    }
}
