package com.atguigu.day15homework.test4;

import java.util.Scanner;

/**
 * @author Symon
 * @version 1.0
 * @className ChangeStr
 * @description TODO
 * @date 2020/8/10 21:24
 */
public class ChangeStr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入源字符串：");
        String srcStr = input.next();
        System.out.println("请输入要删除的字符串：");
        String del = input.next();
        String result = srcStr.replaceAll(del, "");
        int count = (srcStr.length() - result.length()) / del.length();

        System.out.println("源字符串有" + count + "个" + del);
        System.out.println("删除后的：" + result);
    }
}
