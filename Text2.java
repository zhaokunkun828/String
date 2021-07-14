package com.zsk.rq;

import java.time.LocalDateTime;

/**
 * 将当前系统时间以"yyyy-MM-dd HH:mm:ss"格式输出
 *
 *
 */
public class Text2 {
    public static void main(String[] args) {
       // String pattern = "yyyy-MM-dd HH:mm:ss";
        LocalDateTime now = LocalDateTime.now();
        System.out.println("当前时间：" + now);
    }
}
