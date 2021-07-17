package com.zsk.day10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Text {
    public static void main(String[] args) {
        Date date =new Date();
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String time=dFormat.format(date);
        System.out.println(time);
    }
}
