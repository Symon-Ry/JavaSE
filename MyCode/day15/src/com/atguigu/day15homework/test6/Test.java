package com.atguigu.day15homework.test6;


import java.util.Arrays;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/11 18:33
 */
public class Test {
    public static void main(String[] args) {
        String[] strs = new String[]{"abc", "qwerqwerqw", "asdf", "hello", "ooo"};
        int nums = 0;
        for (String str : strs) {
            if (str.length() <= 5) {
                nums++;
            }
        }
        String[] strings = new String[nums];
        for (int i = 0, j = 0; i < strs.length; i++) {
            if (strs[i].length() <= 5) {
                strings[j++] = strs[i];
            }
        }
        System.out.println(Arrays.toString(strings));
    }
}
