package com.zsk.rq;

import java.time.LocalDateTime;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 *
 *
 */
public class Text1 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("当前时间：" + now);
        LocalDateTime plusTime = now.plusDays(3);
        System.out.println("三天后这一刻是：" + plusTime);
    }
}
