package com.atguigu.day15homework.test13;

import java.util.Arrays;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/11 20:39
 */
public class Test {
    public static void main(String[] args) {
        String str = "1.hello2.world3.java4.string";

        String[] split = str.split("\\d.");
        System.out.println(Arrays.toString(split));
        System.out.println(split.length);

        for (String s : split) {
            if (!s.equals(" ")) {
                System.out.println(s);
            }
        }

    }
}
