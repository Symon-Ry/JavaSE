package com.atguigu.day15homework.test5;


/**
 * @author Symon
 * @version 1.0
 * @className DecimalsToString
 * @description TODO
 * @date 2020/8/10 21:15
 */
public class DecimalsToString {

    public static void main(String[] args) {
        Double d = Math.random() * 100;
        String s = d.toString();
        System.out.println("随机数为：" + s);
        System.out.println("转换为：" + s.substring(0, s.indexOf('.') + 3));


    }

}
