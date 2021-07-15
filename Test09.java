package com.zsk.day08;

import com.zsk.collectiondemo.Person;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
 * 然后输出每个员工的转正仪式日期。
 * 转正仪式日期为:入职3个月的当周周五
 *
 * @author Xiloer
 *
 */
public class Test09 {
    private String name;
    private int age;
    private String gender;
    private double salary;
    public Test09(String name,int age,String gender,double salary){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入员工信息:");
        String input = scan.nextLine();//接收信息name,age,gender,salary;name,age,gender,salary;....

    }
}
