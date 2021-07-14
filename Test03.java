package com.zsk.text;
/**
 * 检查一个字符串是否为回文
 * 回文:正着念与反着念一样，例如:上海自来水来自海上
 */
public class Test03 {
    public static void main(String[] args) {
        String str = "上海自来水来自海上";
        if(check(str)){
            System.out.println("是回文");
        }else{
            System.out.println("不是回文");
        }
    }

    public static boolean check(String str){
        //charAt实现
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;

    }
}
