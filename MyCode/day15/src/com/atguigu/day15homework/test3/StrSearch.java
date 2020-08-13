package com.atguigu.day15homework.test3;

import java.util.Scanner;

/**
 * @author Symon
 * @version 1.0
 * @className StrSearch
 * @description TODO
 * @date 2020/8/10 20:58
 */
public class StrSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入大字符串");
        String big = input.next();
        System.out.println("请输入小字符串");
        String small = input.next();

        int index = 0;
        int count = 0;
        while ((index=big.indexOf(small)) != -1) {
            big = big.substring(small.length() + index);
            count++;
        }
        System.out.println(count);
    }
}
