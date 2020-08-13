package com.atguigu.day15homework.test1;

import java.util.Scanner;

/**
 * @author Symon
 * @version 1.0
 * @className ReverseTest
 * @description TODO
 * @date 2020/8/10 20:47
 */
public class ReverseTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符串");
        String s = input.next();
        StringBuilder ss = new StringBuilder(s);
        System.out.println("反转后：" + ss.reverse().toString());
    }
}
