package com.zsk.rq;

import java.text.ParseException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18

 *
 */
public class Text5 {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的身份证号：");
        String birthday = input.nextLine();

        //因为\\w单词字符是任何的字母，数字或者下划线字符,所以[^_]的作用是最后1位数可以是除掉"_"之外的单词字符
        String regex = "[\\d]{17}[\\w&&[^_]]{1}";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(birthday);

        if (matcher.matches()) {
            //截取输入身份证的年月日
            int year = Integer.parseInt(birthday.substring(6, 10));
            int month = Integer.parseInt(birthday.substring(10, 12));
            int day = Integer.parseInt(birthday.substring(12, 14));
            System.out.println("你的生日是" + year + "年" + month + "月" + day + "日");

            //得到20岁生日当天的日期
            int TwentyBirthYear = year + 21;
            System.out.println("你的21岁生日是" + TwentyBirthYear + "年" + month + "月" + day + "日");


        }
    }
}