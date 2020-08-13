package com.atguigu.day15homework.test11;

import java.util.Arrays;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/11 20:00
 */
public class Test {
    public static void main(String[] args) {
        String abc = "342567891";
        byte[] bytes = abc.getBytes();
        Arrays.sort(bytes);
        System.out.println(new String(bytes));

    }
}
